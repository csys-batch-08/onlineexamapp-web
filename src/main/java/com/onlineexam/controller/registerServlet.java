package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.exception.*;
import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;

@WebServlet("/register")
public class registerServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		PrintWriter out = null;
		try {
			out = res.getWriter();
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String confirmpassword = req.getParameter("cpassword");
			Long phonenumber = Long.parseLong(req.getParameter("phone_number"));
			RegisterPojo rd = new RegisterPojo(firstName, lastName, email, password, confirmpassword, phonenumber);
			RegisterDao rdao = new RegisterDao();
			ResultSet rs = rdao.getEmailDetails(rd);
			ResultSet rs1 = rdao.getPhoneDetails(rd);
			if (rs.next() && email.equals(rs.getString(4))) {
				throw new EmailAlreadyExistException();
			}
			if (rs1.next() && phonenumber == (rs1.getLong(7))) {
				throw new PhoneNumberExistException();
			}
			rdao.fetchregister(rd);
			res.sendRedirect("index.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		} catch (EmailAlreadyExistException ea) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('email already exist');");
			out.println("location='register.jsp';");
			out.println("</script>");
		} catch (PhoneNumberExistException pn) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Phone number already exist');");
			out.println("location='register.jsp';");
			out.println("</script>");
		}
	}
}
