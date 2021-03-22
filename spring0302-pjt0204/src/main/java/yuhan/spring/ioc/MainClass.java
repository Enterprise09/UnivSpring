package yuhan.spring.ioc;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		
//		new MyCalculator();

	}

}
