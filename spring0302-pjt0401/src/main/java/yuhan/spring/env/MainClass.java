package yuhan.spring.env;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = context.getEnvironment();
		MutablePropertySources propertySrc = env.getPropertySources();

		try {
			propertySrc.addLast(new ResourcePropertySource("classpath:user.properties"));
			System.out.println(env.getProperty("user.id"));
			System.out.println(env.getProperty("user.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		GenericXmlApplicationContext ctx = (GenericXmlApplicationContext) context;
		ctx.load("classpath:envCTX.xml");
		ctx.refresh();

		UserConnection userconnection = ctx.getBean("userConnection", UserConnection.class);

		System.out.println("id : " + userconnection.getUserId());
		System.out.println("pw : " + userconnection.getUserPw());

		ctx.close();
		context.close();

	}

}
