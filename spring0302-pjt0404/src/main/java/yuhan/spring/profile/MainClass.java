package yuhan.spring.profile;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = null;
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		config = "dev";
		if(str == "dev") {
			config = "dev";
			System.out.println(config);
		}else if(str == "run") {
			config = "run";
			System.out.println(config);
		}
		
		scan.close();
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IP : " + info.getIpNum());
		System.out.println("PORT : " + info.getPortNum());
		
		ctx.close();
		
	}

}
