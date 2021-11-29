package yuhan.mvc.board.dao;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import yuhan.mvc.board.dto.BoardDto;
import yuhan.mvc.board.util.ConstantTemplate;

public class BoardDao {
	
	JdbcTemplate template;
	DataSource dataSource = null;
	
	public BoardDao() {
		this.template = ConstantTemplate.template;
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BoardDto> list() {
		ArrayList<BoardDto> dtos = null;
		String sql = "select * from yuhan_board";
		dtos = (ArrayList<BoardDto>) template.query(sql, new BeanPropertyRowMapper<BoardDto>(BoardDto.class));
		
		return dtos;
	}
	
	
	
}
