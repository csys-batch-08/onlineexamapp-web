package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/request")
public class InactiveUserRequestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			PrintWriter out = resp.getWriter();
			String email = req.getParameter("email");
			String reason = req.getParameter("reason");
			Register rp = new Register(email, reason);
			RegisterDaoImpl rd = new RegisterDaoImpl();
			rd.userrequest(rp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your request has been sent');");
			out.println("location='index.jsp';");
			out.println("</script>");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
