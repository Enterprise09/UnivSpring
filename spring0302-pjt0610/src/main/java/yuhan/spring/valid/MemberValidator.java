package yuhan.spring.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Member.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		System.out.println("-------Validator-------");
		Member member = (Member) target;		
		String memname = member.getName();
		
		if(memname == null || memname.trim().isEmpty()) {
			errors.rejectValue("name", "회원이름 입력 오류 발생");
		}

	}

}
