package yuhan.spring.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	@RequestMapping(value = "/yuhanLogin")
	public String loginForm() {
		
		return "member/loginForm";
	}
	
	
	

}
