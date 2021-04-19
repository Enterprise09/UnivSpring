package yuhan.spring.pre;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:baseball.xml");
		ctx.refresh();
		
		Player player = ctx.getBean("player", Player.class);
		System.out.println("�����̸� : " + player.getName());
		System.out.println("���� : " + player.getAge());
		System.out.println("������ : " + player.getPosition());
		System.out.println("Ű : " + player.getHeight());
		System.out.println("������ : " + player.getWeight());
		
		System.out.println("===============================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("�����̸� : " + player2.getName());
		System.out.println("���� : " + player2.getAge());
		System.out.println("������ : " + player2.getPosition());
		System.out.println("Ű : " + player2.getHeight());
		System.out.println("������ : " + player2.getWeight());
		
		ctx.close();

	}

}
