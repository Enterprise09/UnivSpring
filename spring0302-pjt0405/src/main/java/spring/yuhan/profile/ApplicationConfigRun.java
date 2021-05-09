package spring.yuhan.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

	public ServerInfo serverInfo() {
		
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIpNum("457.153.88.19");
		serverInfo.setPortNum("3002");
		
		return null;
	}
	
}
