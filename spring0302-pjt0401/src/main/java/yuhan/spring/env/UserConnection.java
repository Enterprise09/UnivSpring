package yuhan.spring.env;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class UserConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String userId;
	private String userPw;	
	
	

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	@Override
	public void setEnvironment(Environment env) {
		
		System.out.println("setEnvironment()");
		setEnv(env);
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setUserId(env.getProperty("user.id"));		// Error Fixed
		setUserPw(env.getProperty("user.pw"));		// getProperty(userId) >> getProperty("user.id")
	}

}
