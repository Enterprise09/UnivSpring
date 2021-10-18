package yuhan.mvc.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import yuhan.mvc.board.dto.BoardDto;

public class BoardDao {
	
	DataSource dataSource;
	
	public BoardDao() {	
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			System.out.println("========driver load=======");
		}catch(Exception e) {
			System.out.println("========driver load error=======");
			e.printStackTrace();
		}
	}
	
	public ArrayList<BoardDto> list() {
		
		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select b_no, b_name, b_subject, b_content, b_date from YUHAN_BOARD";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery(query);
			while(resultSet.next()) {
				int b_no = resultSet.getInt("b_no");
				String b_name = resultSet.getString("b_name");
				String b_subject = resultSet.getString("b_subject");
				String b_content = resultSet.getString("b_content");
				Timestamp b_date = resultSet.getTimestamp("b_date");
				
				BoardDto dto = new BoardDto(b_no, b_name, b_subject, b_content, b_date);
				dtos.add(dto);
			}
		}catch (Exception e) {
			System.out.println("========connection error=======");			
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return dtos;
	}
	
	public void delete(String b_no) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "delete * from YUHAN_BOARD where b_no = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(b_no));
			preparedStatement.execute(query);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void write(String b_name, String b_subject, String b_content) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into YUHAN_BOARD(b_no, b_name, b_subject, b_content) values(yuhan_board_seq.nextval, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, b_name);
			preparedStatement.setString(2, b_subject);
			preparedStatement.setString(3, b_content);
			
			int result = preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
