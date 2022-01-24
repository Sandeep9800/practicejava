package com.school;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SchoolRegistration
 */
@WebServlet("/SchoolRegistration")
public class SchoolRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("sno"));
		String name=request.getParameter("name");
		int mark=Integer.parseInt(request.getParameter("marks"));
		try {
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Saam");
			PreparedStatement ps=connection.prepareStatement("insert into stureg values(?,?,?)");
			PrintWriter pw=response.getWriter();
			System.out.println("Successfully connected");
//			String sql="insert into stureg values(?,?,?)";
			ps.setInt(1, rollno);
			ps.setString(2, name);
			ps.setInt(3, mark);
			ps.executeUpdate();
				
				
			
			pw.print("Successfully inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
