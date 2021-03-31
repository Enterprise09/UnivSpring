package yuhan.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
			System.out.println(student1.getAge());
			System.out.println(student1.getHobbys());
		}
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getAge());
		System.out.println(student3.getHobbys());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}else {
			System.out.println("student1 != student3");
		}
		
	}

}
