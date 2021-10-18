package yuhan.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.mvc.board.service.BoardListService;
import yuhan.mvc.board.service.BoardWriteService;
import yuhan.mvc.board.service.IBoardService;

@Controller
public class BoardController {
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		IBoardService service = new BoardListService();
		service.execute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "/write_view")
	public String write_view(HttpServletRequest request, Model model) {
		
		
		return "write_view";
	}
	
	@RequestMapping(value ="/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		IBoardService service = new BoardWriteService();
		service.execute(model);
		
		return "redirect:list";
	}
}
