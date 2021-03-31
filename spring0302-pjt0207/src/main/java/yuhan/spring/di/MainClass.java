package yuhan.spring.di;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		
		Brand brand = ctx.getBean("brand", Brand.class);
		brand.like();
		
		ctx.close();

	}

}
