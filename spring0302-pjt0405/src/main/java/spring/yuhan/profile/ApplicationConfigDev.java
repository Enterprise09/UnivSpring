package spring.yuhan.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {

	@Bean(name = "serverInfo")
	public ServerInfo serverInfo() {		
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIpNum("195.457.32.11");
		serverInfo.setPortNum("8087");
		
		return null;
	}
	
}
