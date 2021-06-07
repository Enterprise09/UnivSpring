package yuhan.spring.valid;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/memberForm")
	public String memberForm() {
		
		return "member/memInput";
	}
	
	@RequestMapping(value = "/inputOk")
	public String inputOk(@ModelAttribute("member")@Valid Member member, BindingResult result){
		String viewName = "member/memberOk";
		MemberValidator mValidator = new MemberValidator();
		mValidator.validate(member, result);
		if(result.hasErrors()) {
			viewName = "member/memInput";
		}
		return viewName;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator((Validator) new MemberController());
	}
	
}
