package yuhan.spring.properties;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:dbCTX.xml");
		
		DBConnetion conn = ctx.getBean("dbConnection", DBConnetion.class);
	
		System.out.println("jdbc.driver : " + conn.getDriver());
		System.out.println("jdbc.url : " + conn.getUrl());
		System.out.println("jdbc.username : " + conn.getUsername());
		System.out.println("jdbc.password : " + conn.getPassword());
	
		ctx.close();
	}

}
