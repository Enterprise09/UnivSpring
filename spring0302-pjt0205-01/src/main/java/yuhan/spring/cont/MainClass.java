package yuhan.spring.cont;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		
		BMICalculator bmiCalc = ctx.getBean("BMICalculator", BMICalculator.class);
		bmiCalc.BMICalculatortion(0, 0);
		
		ctx.close();
				

	}

}
