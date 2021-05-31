package yuhan.spring.attr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value = "/form")
	public String userForm() {
		
		
		return "/user/userForm2";
	}
	
	
	@RequestMapping(value = "/userInfo")
	public String userInfor(
			@ModelAttribute("userInfo") StudentInformation studentInformation) {
		
		return "user/userInfo2";
	}
	
	

}
