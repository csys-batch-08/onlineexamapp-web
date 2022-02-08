package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/active")
public class InactiveUsersServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			PrintWriter out = resp.getWriter();
			int userid = Integer.parseInt(req.getParameter("userid"));

			Register rp = new Register(userid);
			RegisterDaoImpl rd = new RegisterDaoImpl();
			rd.makeactive(rp);

			out.println("<script type=\"text/javascript\">");
			out.println("alert('Made user as active');");
			out.println("location='ShowUsers';");
			out.println("</script>");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
	}
}
