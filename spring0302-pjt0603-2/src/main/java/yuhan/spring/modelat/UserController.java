package yuhan.spring.modelat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class UserController {
	
	@ModelAttribute("customerId")
	public String[] CustomerId() {
		return new String[] {"����", "����", "���"};
	}
	
	@RequestMapping(value="/userForm", method=RequestMethod.GET)
		public String userForm() {
		return "user/userForm";
	}

	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userForm1() {
		return "user/userForm1";
	}
	@ModelAttribute("userVO")
	public UserVO init(HttpServletRequest request){
		UserVO userVO = new UserVO();
		userVO.setName("�̸��� �Է��ϼ���..");
		userVO.setAddress("�ּҸ� �Է��ϼ���..");
		userVO.setHobby("��̸� �Է��ϼ���..");
		return userVO;
	}
	@RequestMapping(value="/userSave", method=RequestMethod.POST)
	public ModelAndView userSave(@ModelAttribute("userVo") UserVO userVO, Model model){
		System.out.println("-----userSave--------------");
		System.out.println("user : "+userVO.toString());
		model.addAttribute("msg" , "ȸ�� ���� ��� ����");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/userInfo1");
		return modelAndView.addObject("userVO", userVO);
	}

}
