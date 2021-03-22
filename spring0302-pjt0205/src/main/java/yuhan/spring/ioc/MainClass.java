package yuhan.spring.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		   
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		 
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();  
		   
		ctx.close();
		
	}

}
