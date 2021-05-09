package spring.yuhan.profile;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = null;
		System.out.println("Enter the Activate CTX name : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equals("dev")) {
			config = "dev";
			System.out.println(config);
		}else if(str.equals("run")) {
			config = "run";
			System.out.println(config);
		}
		
		scan.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
				
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IP : " + info.getIpNum());
		System.out.println("PORT : " + info.getPortNum());
		
		ctx.close();
		
	}

}
