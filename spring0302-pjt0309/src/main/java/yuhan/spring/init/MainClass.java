package yuhan.spring.init;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:baseball.xml");
		ctx.refresh();
		
		Player player1 = ctx.getBean("player1", Player.class);
		
		System.out.println("선수 이름 : " + player1.getName());
		System.out.println("선수 나이 : " + player1.getAge());
		System.out.println("선수 포지션 : " + player1.getPosition());
		System.out.println("선수 몸무게 : " + player1.getWeight());
		System.out.println("선수 키 : " + player1.getHeight());
		
		ctx.close();
		
	}

}
