package yuhan.spring.pre;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:baseball.xml");
		ctx.refresh();
		
		Player player = ctx.getBean("player", Player.class);
		System.out.println("선수이름 : " + player.getName());
		System.out.println("나이 : " + player.getAge());
		System.out.println("포지션 : " + player.getPosition());
		System.out.println("키 : " + player.getHeight());
		System.out.println("몸무게 : " + player.getWeight());
		
		System.out.println("===============================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("선수이름 : " + player2.getName());
		System.out.println("나이 : " + player2.getAge());
		System.out.println("포지션 : " + player2.getPosition());
		System.out.println("키 : " + player2.getHeight());
		System.out.println("몸무게 : " + player2.getWeight());
		
		ctx.close();

	}

}
