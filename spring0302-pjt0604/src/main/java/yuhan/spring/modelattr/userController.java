package yuhan.spring.modelattr;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {
	
	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userForm(){
		
		return "user/userForm1";
	}
	
	
	public UserVo init(HttpServletRequest requset) {
		
		if(requset.getMethod().equals("GET")) {
			UserVo userVo = new UserVo();
			userVo.setName("이름을 입력하세요.");
			userVo.setAddress("주소를 입력하세요.");
			userVo.setHobby("취미를 입력하세요.");
			
			return userVo;
		}
		else {
			return new UserVo();
		}		
	}
	
	
	@RequestMapping(value="/userSave", method = RequestMethod.POST)
	public ModelAndView userSave(@ModelAttribute("userVo") UserVo userVo, Model model){
		model.addAttribute("msg", "회원정보 출력 성공");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/userInfo1");
		modelAndView.addObject("userVo", userVo);
		
		return modelAndView;
	}

}
