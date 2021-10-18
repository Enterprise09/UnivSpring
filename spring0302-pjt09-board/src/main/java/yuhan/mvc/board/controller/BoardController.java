package yuhan.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yuhan.mvc.board.service.BoardContentService;
import yuhan.mvc.board.service.BoardDeleteService;
import yuhan.mvc.board.service.BoardListService;
import yuhan.mvc.board.service.BoardModifyService;
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
	
	@RequestMapping(value ="/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		IBoardService service = new BoardContentService();
		service.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value ="/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		IBoardService service = new BoardDeleteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value ="/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		IBoardService service = new BoardModifyService();
		service.execute(model);
		
		return "redirect:list";
	}
}
