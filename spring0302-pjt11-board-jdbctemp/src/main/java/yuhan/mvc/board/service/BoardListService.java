package yuhan.mvc.board.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import yuhan.mvc.board.dao.BoardDao;
import yuhan.mvc.board.dto.BoardDto;

public class BoardListService implements IBoardService {

	@Override
	public void execute(Model model) {
		ArrayList<BoardDto> dtos = null;
		BoardDao dao = new BoardDao();
		dtos = dao.list();
		
		System.out.println(dtos.toString());
		
		
	}

}
