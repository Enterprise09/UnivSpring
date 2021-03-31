package yuhan.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("NAME : " + student1.getName());
		System.out.println("AGE : " + student1.getAge());
		System.out.println("HEIGHT : "+ student1.getHeight());
		System.out.println("WEIGHT : " + student1.getWeight());
		System.out.println("HOBBYS : " + student1.getHobbys());
		
		ctx.close();

	}

}
