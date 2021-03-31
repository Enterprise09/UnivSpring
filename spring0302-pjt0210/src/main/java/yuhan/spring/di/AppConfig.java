package yuhan.spring.di;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("Swim");
		hobbys.add("Hacking");
		
		Student student = new Student("TeaHo", 21, hobbys);
		student.setHeight(190);
		student.setWeight(90);
		
		return student;
	}
	
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("Riding");
		hobbys.add("Camping");
		
		Student student = new Student("Enterprise", 21, hobbys);
		student.setHeight(150);
		student.setWeight(45);
		
		return student;
	}
	
}
