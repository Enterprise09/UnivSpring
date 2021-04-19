package yuhan.spring.init;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:baseball.xml");
		ctx.refresh();
		
		Player player1 = ctx.getBean("player1", Player.class);
		
		System.out.println("���� �̸� : " + player1.getName());
		System.out.println("���� ���� : " + player1.getAge());
		System.out.println("���� ������ : " + player1.getPosition());
		System.out.println("���� ������ : " + player1.getWeight());
		System.out.println("���� Ű : " + player1.getHeight());
		
		ctx.close();
		
	}

}
