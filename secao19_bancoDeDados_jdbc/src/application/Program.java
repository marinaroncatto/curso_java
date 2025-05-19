package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//parte 1 - consultando dados do banco 
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}*/

		//parte 2 - inserindo dados no banco
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Connection conn2 = null;
		PreparedStatement pst = null;
		
		try {
			conn2 = DB.getConnection();
			pst = conn2.prepareStatement(
					"INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES (?, ?, ?, ?, ?)"
					);
			
			pst.setString(1, "Carl Purple");
			pst.setString(2, "carl@gmai.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			pst.setDouble(4, 3000.0);
			pst.setInt(5, 4);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}
		
	}//main

}
