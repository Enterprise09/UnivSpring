package yuhan.spring.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String[] swlanguage = {"c", "c++", "java", "jsp",  "spring"};
		String[] discription = {"C는 1972년 켄 톰슨과 데니스 리치가 유닉스 운영 체제에서 사용하기 위해 개발한 프로그래밍 언어이다.",
		           "C++는 AT&T 벨 연구소의 비야네 스트롭스트룹이 1983년 발표하여 발전한 프로그래밍 언어이다.", 
		           "자바는 썬 마이크로시스템즈의 제임스고슬링(James Gosling)과 다른 연구원들이 개발한 객체 지향적 프로그래밍 언어이다.",
		           "JSP는 HTML내에 자바 코드를 삽입하여 웹 서버에서 동적으로 웹 페이지를 생성하여 웹 브라우저에 돌려주는 언어이다.", 
		           "스프링 프레임워크는 자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로서 국내 웹개발에 가장많이 사용되는프레임워크로불린다."};

		//appConfig.xml 설정파일 등록
		GenericXmlApplicationContext ctx = 
			new GenericXmlApplicationContext("classpath:appConfig.xml");

		
		//WordRegisterService객체 생성
		WordRegisterService registerService = 
		    ctx.getBean("registerService", WordRegisterService.class);
		    
		
		for (int i = 0; i < discription.length; i++) { 				
			//WordSet 객체 생성 > 생성자의 매개변수 넘김 > DB에 저장시킴
			//여러개의 객체를 swlanguage와 discription를 이용하여 반복적으로 생성
		    WordSet wordSet = new  WordSet(swlanguage[i], discription[i]);
		    registerService.register(wordSet); 	//위에서 생성한 WordRegisterService의 메소드를 활용
		}
		 
		
		//WordSearchService객체 생성
		WordSearchService searchService = 
		ctx.getBean("searchService", WordSearchService.class);

		System.out.println(" \n \n------------------------------------");
		
		for (int i = 0; i < swlanguage.length; i++) {			
			//새로운 WordSet 객체 생성 
			//DB에 저장된 데이터를 화면에 출력
			WordSet wordSet = searchService.searchWord(swlanguage[i]);
			System.out.print(wordSet.getWordKey() + " \t: ");
			System.out.println(wordSet.getWordValue());
			System.out.println("[출처:위키피디아(https://www.wikipedia.org/)]");
			System.out.println("------------------------------------");
		}
		System.out.println(" \n \n");

		ctx.close();

		}

	}


