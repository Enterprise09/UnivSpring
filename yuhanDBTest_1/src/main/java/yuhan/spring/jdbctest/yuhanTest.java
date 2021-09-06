package yuhan.spring.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class yuhanTest {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			System.out.println("DB Driver loading");
			
			Connection conn = DriverManager.getConnection(url, "yuhan", "yuhan");
			System.out.println("DB Connection: " + conn);
			
			String query = "select * from mvc_board";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				System.out.println("b_id: " + result.getNString(1));
				System.out.println("b_name: " + result.getNString(2));
				System.out.println("b_title: " + result.getNString(3));
				System.out.println("b_content: " + result.getNString(4));
				System.out.println("==========================");
			}
			
			result.close();
			preparedStatement.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
