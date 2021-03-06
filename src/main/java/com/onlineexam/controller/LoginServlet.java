package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.exception.InactiveUserException;
import com.onlineexam.exception.InvalidUserException;
import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		HttpSession session = req.getSession();
		PrintWriter out = null;
		try {
			out = res.getWriter();
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			Register rp = new Register(0, email, password);
			RegisterDaoImpl rd = new RegisterDaoImpl();
			int userid;
			String username;
			Register register = rd.fetchlogin(rp);
			if (register == null) {
				throw new InvalidUserException();
			}
			Register rpojo = rd.validUser(email, password);
			userid = rpojo.getUserid();
			username = rpojo.getFirstName();
			HttpSession ses = req.getSession();
			ses.setAttribute("userid", userid);
			ses.setAttribute("username", username);
			ses.setAttribute("mailid", rpojo.getEmail());
			String role = rpojo.getRole();
			if (role.equals("admin")) {
				res.sendRedirect("adminMain.jsp");
			} else if (role.equals("student")) {
				Register rp1 = new Register(userid);
				rd.updateactivedate(rp1);
				RegisterDaoImpl rdao = new RegisterDaoImpl();
				Register regpojo = rdao.userprofile(userid);
				session.setAttribute("profile", regpojo);
				res.sendRedirect("userMain.jsp");
			} else if (role.equals("inactive")) {
				throw new InactiveUserException();
			} else {
				session.setAttribute("loginResult", "Invalid username or password");
			}
		} catch (InvalidUserException iv) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Invalid email id or password');");
			out.println("location='index.jsp';");
			out.println("</script>");
		} catch (InactiveUserException e) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('You are in inactive mode.Request admin to activate');");
			out.println("location='request.jsp';");
			out.println("</script>");
		} catch (IOException e1) {
			e1.getMessage();
		} catch (NumberFormatException e2) {
			e2.getMessage();
		}
	}

}
