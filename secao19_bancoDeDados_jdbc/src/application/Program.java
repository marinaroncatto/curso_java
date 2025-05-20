package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

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

	/*
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
		} */
		
		/*
		//parte 3: update de dados 
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller SET BaseSalary = BaseSalary + ? "
					+ "WHERE (DepartmentId = ?)");
			
			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows affected: " + rowsAffected);
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		} */
		
	/*	//parte 4: Delete
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE id = ?");
			st.setInt(1, 5);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		
		}catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		} */
		
		//parte 5: transações -> ou tudo funciona ou nada deve ser auterado
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); //inicia a transação -> necessita de confirmação para executar
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//int x = 1;
			//if(x <2) 
			//	throw new SQLException("Fake error");
			
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();//confirma a transação
			
			System.out.println("Rows1: " + rows1);
			System.out.println("Rows2: " + rows2);
		}catch(SQLException e) {
			try {
				conn.rollback(); //caso algum erro ocorra, retornar ao valor original no banco
				throw new DbException("Transaction rolled back! Caused by: " +e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " +e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
	}//main

}
