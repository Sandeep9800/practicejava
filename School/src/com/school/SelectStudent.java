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
 * Servlet implementation class SelectStudent
 */
@WebServlet("/SelectStudent")
public class SelectStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		PrintWriter out=response.getWriter();
		try {
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Saam");
			PreparedStatement ps=connection.prepareStatement("select * from stureg where sno=?");
			ps.setInt(1, rollno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			out.println("sno: "+rs.getInt(1));	
			out.println("sname:"+rs.getString(2));
			out.println("marks:"+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
