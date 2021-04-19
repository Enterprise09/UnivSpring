package yuhan.spring.resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationCTX.xml");
		
		ClassGrade classGrade = ctx.getBean("classGrade", ClassGrade.class);
		
		
		
		ctx.close();

	}

}
