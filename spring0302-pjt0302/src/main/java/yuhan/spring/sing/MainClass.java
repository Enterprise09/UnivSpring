package yuhan.spring.sing;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		InjectionBean injectionBean = ctx.getBean("injection", InjectionBean.class);
		
		DependencyBean dependencyBean01 = ctx.getBean("dependency", DependencyBean.class);
		DependencyBean dependencyBean02 = ctx.getBean("dependency", DependencyBean.class);
		
		
		if(dependencyBean01.equals(dependencyBean02)) {
			System.out.println("dependencyBean01 == dependencyBean02");
		}
		else {
			System.out.println("dependencyBean01 != dependencyBean02");
		}
		
		ctx.close();

	}

}
