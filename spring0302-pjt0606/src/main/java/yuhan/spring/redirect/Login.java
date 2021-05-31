package yuhan.spring.redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	@RequestMapping(value = "/yuhanLogin")
	public String loginForm() {
		
		return "member/loginForm";
	}
	
	
	@RequestMapping(value = "memberConfirm")
	public String memberRedirect(HttpServletRequest req, Model model) {
		
		String id = req.getParameter("id");
		if(id.equals("enterprise")) {
			return "redirect:memberOk";
		}
		else {
			return "redirect:memberFail";
		}
		
	}	
	
	@RequestMapping(value = "memberOk")
	public String memberOk() {
		return "member/memberOk";
	}
	
	@RequestMapping(value = "memberFail")
	public String memberFail() {
		return "member/memberFail";
	}

}
