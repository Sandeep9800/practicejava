package com.school;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("uname"));
		String psw=request.getParameter("psw");
		PrintWriter out=response.getWriter();
		try {
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Saam");
			PreparedStatement ps=con.prepareStatement("select * from stureg where sno=? and sname=?");
			ps.setInt(1, rollno);
			ps.setString(2, psw);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				out.println("sno:"+rs.getInt(1));
				out.println("sname:"+rs.getString(2));
				out.println("marks:"+rs.getInt(3));
			}else {
				out.println("Invalid uesr");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
