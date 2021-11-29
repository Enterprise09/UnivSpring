package yuhan.mvc.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.mvc.board.service.BoardListService;
import yuhan.mvc.board.service.IBoardService;

@Controller
public class BoardController {
	
	IBoardService service = null;
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	@RequestMapping("/list")
	public String list(Model model) {
		
		IBoardService service = new BoardListService();
		service.execute(model);
		
		return "list";
	}

}
