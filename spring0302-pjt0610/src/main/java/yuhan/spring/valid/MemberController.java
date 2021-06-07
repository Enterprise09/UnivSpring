package yuhan.spring.valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/memberForm")
	public String memberForm() {
		
		return "member/memInput";
	}
	
	@RequestMapping(value = "/inputOk")
	public String inputOk(Member member, BindingResult result){
		
		
		
		return null;
	}
	
}
