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
		String memName = member.getName();
		
		if(memName == null || memName.trim().isEmpty()) {
			System.out.println("회원이름 입력오류");
			errors.rejectValue("name", "회원이름 입력 오류 발생");
		}
		
		String memId = member.getId();
		if(memId == null || memId.trim().isEmpty()) {
			System.out.println("회원 ID 입력오류");
			errors.rejectValue("name", "회원 ID 입력 오류 발생");
		}
		
		int memNo = member.getMemNo();
		if(memNo == 0) {
			System.out.println("회원 주민번호 입력오류");
			errors.rejectValue("memNo", "주민번호 입력오류");
		}

	}

}
