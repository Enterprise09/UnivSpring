package yuhan.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
		
		PetOwner petOwner = context.getBean("petOwner", PetOwner.class);
		
		petOwner.play();
		
		context.close();

	}

}
