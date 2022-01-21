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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		boolean flag;
		Long adminnum=8870623149l;
		Long PhoneNumber=Long.parseLong(req.getParameter("phone_number"));
		String password=req.getParameter("password");
		String cpassword=req.getParameter("cpassword");
		RegisterPojo rp=new RegisterPojo(PhoneNumber, password, cpassword);
		RegisterDao rd=new RegisterDao();
		
		try {
		
		if(PhoneNumber.equals(adminnum)) {
			throw new InvalidPhoneNumberException();
			
			
		}
		else {
			flag=rd.changepassword(rp);
			if(flag) {
				session.setAttribute("changed", "Your password has changed");
				resp.sendRedirect("index.jsp");
			}
			else {
				throw new InvalidPhoneNumberException();
			}
		}
		}catch(InvalidPhoneNumberException ipn) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Entered phone number is invalid')");
			out.println("location='UserPasswordUpdateServlet.jsp';");
			out.println("</script>");
			//resp.sendRedirect("errorpage.jsp?message="+ipn.getMessage()+"&url=UserPasswordUpdateServlet.jsp");
		} 
		
	}
}
