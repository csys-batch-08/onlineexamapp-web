package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.exception.InvalidPhoneNumberException;
import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;

@WebServlet("/changepassword")
public class PasswordChangeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		PrintWriter out = null;
		boolean flag;
		try {
			out = resp.getWriter();
			Long adminnum = 8870623149l;
			Long phoneNumber = Long.parseLong(req.getParameter("phone_number"));
			String password = req.getParameter("password");
			String cpassword = req.getParameter("cpassword");
			RegisterPojo rp = new RegisterPojo(phoneNumber, password, cpassword);
			RegisterDao rd = new RegisterDao();

			if (phoneNumber.equals(adminnum)) {
				throw new InvalidPhoneNumberException();
			} else {
				flag = rd.changepassword(rp);
				if (flag) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Your password has changed')");
					out.println("location='index.jsp';");
					out.println("</script>");
				} else {
					throw new InvalidPhoneNumberException();
				}
			}
		} catch (InvalidPhoneNumberException ipn) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Entered phone number is invalid')");
			out.println("location='userPasswordUpdate.jsp';");
			out.println("</script>");
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}
}
