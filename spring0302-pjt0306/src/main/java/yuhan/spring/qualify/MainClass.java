package yuhan.spring.qualify;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appContext.xml");
		
		Student student = ctx.getBean("student", Student.class);
		
		student.useStudent();

	}

}
