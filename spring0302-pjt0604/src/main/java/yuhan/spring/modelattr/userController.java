package yuhan.spring.modelattr;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class userController {
	
	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userForm(){
		
		return "user/userForm1";
	}
	
	
	public UserVo init(HttpServletRequest requset) {
		
		if(requset.getMethod().equals("GET")) {
			UserVo userVo = new UserVo();
			userVo.setName("�̸��� �Է��ϼ���.");
			userVo.setAddress("�ּҸ� �Է��ϼ���.");
			userVo.setHobby("��̸� �Է��ϼ���.");
			
			return userVo;
		}
		else {
			return new UserVo();
		}		
	}

}
