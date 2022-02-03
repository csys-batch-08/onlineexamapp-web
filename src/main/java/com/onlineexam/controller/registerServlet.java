package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.exception.EmailAlreadyExistException;
import com.onlineexam.exception.PhoneNumberExistException;
import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

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
			Register rd = new Register(firstName, lastName, email, password, confirmpassword, phonenumber);
			RegisterDaoImpl rdao = new RegisterDaoImpl();
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
		} catch (SQLException e) {
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
