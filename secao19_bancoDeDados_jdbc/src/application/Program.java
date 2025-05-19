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
			//Exemplo 1:
			pst = conn2.prepareStatement(
					"INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES (?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);//retorna o(s) id(s) que serão criados
			
			pst.setString(1, "Carl Purple");
			pst.setString(2, "carl@gmai.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			pst.setDouble(4, 3000.0);
			pst.setInt(5, 4);
			
			//EXAMPLE 2 inserindo mais de um Value:
			//pst = conn2.prepareStatement(
			//		"insert into department (Name) values ('D1'),('D2')", 
			//		Statement.RETURN_GENERATED_KEYS);

			
			int rowsAffected = pst.executeUpdate();
			
			//Informar os Ids criados
			if(rowsAffected > 0) {
				ResultSet rs = pst.getGeneratedKeys();
				
				while(rs.next()) {
					int id = rs.getInt(1); //para retornar a primeira linha
					System.out.println("Done! Id: " + id);
				}
			}else {
				System.out.println("No rows affected!");
			}
			
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
