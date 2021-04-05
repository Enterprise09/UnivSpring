package yuhan.spring.sing;

public class DependencyBean {
	
	private InjectionBean injection;
	
	public DependencyBean(InjectionBean injection) {
		System.out.println("Dependency : »ý¼ºÀÚ");
		this.injection = injection;		
	}

	public InjectionBean getInjection() {
		System.out.println("Dependency : getter");
		return injection;
	}

	public void setInjection(InjectionBean injection) {
		System.out.println("Dependency : setter");
		this.injection = injection;
	}
	
	

}
