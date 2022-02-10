package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.exception.EmailAlreadyExistException;
import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final String LOCATION_REGISTER_JSP = "location='register.jsp';";
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

			String password = req.getParameter("password");
			String confirmpassword = req.getParameter("cpassword");
			Long phonenumber = Long.parseLong(req.getParameter("phone_number"));
			Register phone = new Register(phonenumber);
			RegisterDaoImpl rdao = new RegisterDaoImpl();

			try {
				Register rs1 = rdao.getPhoneDetails(phone);
				if (rs1 != null) {
					throw new EmailAlreadyExistException();
				}
				String email = req.getParameter("email");
				Register mail = new Register(email);
				try {
					Register rs = rdao.getEmailDetails(mail);
					if (rs != null) {
						throw new EmailAlreadyExistException();
					}
					Register rd = new Register(firstName, lastName, email, password, confirmpassword, phonenumber);
					int i = rdao.fetchregister(rd);
					if (i > 0) {
						out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
						out.println("alert('You have registered successfully');");
						out.println("location='login.jsp';");
						out.println(SCRIPT);
					}
				} catch (EmailAlreadyExistException ea) {
					out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
					out.println("alert('email already exist');");
					out.println(LOCATION_REGISTER_JSP);
					out.println(SCRIPT);
				}

			} catch (EmailAlreadyExistException ea) {
				out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
				out.println("alert('phone number already exist');");
				out.println(LOCATION_REGISTER_JSP);
				out.println(SCRIPT);
			}
		} catch (IOException | NumberFormatException e1) {
			e1.getMessage();
		}
	}
}
