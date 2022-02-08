package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.exception.EmailAlreadyExistException;
import com.onlineexam.exception.PhoneNumberExistException;
import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String SCRIPT = "</script>";
	private static final String SCRIPT_TYPE_TEXT_JAVASCRIPT = "<script type=\"text/javascript\">";

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
			Register rs = rdao.getEmailDetails(rd);
			Register rs1 = rdao.getPhoneDetails(rd);
			if (rs != null && email.equals(rs.getEmail())) {
				throw new EmailAlreadyExistException();
			}
			if (rs1 != null && phonenumber == (rs1.getPhoneNumber())) {
				throw new PhoneNumberExistException();
			}
			int i = rdao.fetchregister(rd);
			if (i > 0) {
				out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
				out.println("alert('You have registered successfully');");
				out.println("location='login.jsp';");
				out.println(SCRIPT);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		} catch (EmailAlreadyExistException ea) {
			out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
			out.println("alert('email already exist');");
			out.println("location='register.jsp';");
			out.println(SCRIPT);
		} catch (PhoneNumberExistException pn) {
			out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
			out.println("alert('Phone number already exist');");
			out.println("location='register.jsp';");
			out.println(SCRIPT);
		}
	}
}
