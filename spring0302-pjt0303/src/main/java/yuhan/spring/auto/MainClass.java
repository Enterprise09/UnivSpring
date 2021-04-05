package yuhan.spring.auto;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		UserClass userClass = ctx.getBean("userclass", UserClass.class);
		
		userClass.yuhanCall();
		
		ctx.close();

	}

}
