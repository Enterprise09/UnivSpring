package yuhan.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		
		return "list";
	}
	
	@RequestMapping(value = "/write_view")
	public String write_view(HttpServletRequest request, Model model) {
		
		
		return "write_view";
	}
}
