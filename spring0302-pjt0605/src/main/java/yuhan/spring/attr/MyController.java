package yuhan.spring.attr;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
	
	@RequestMapping("/form")
	public String userForm() {
		
		
		return "/user/userForm2";
	}
	
	
	@RequestMapping("/userInfo")
	public String userInfor(
			@ModelAttribute("userInfo") StudentInformation studentInformation) {
		
		return "user/userInfo2";
	}
	
	

}
