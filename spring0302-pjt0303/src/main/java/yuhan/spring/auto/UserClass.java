package yuhan.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class UserClass {
	
	private Yuhan yuhan;
	
	@Autowired
	public UserClass(Yuhan yuhan) {
		
		this.yuhan = yuhan;
		
	}

	public Yuhan getYuhan() {
		return yuhan;
	}

	public void setYuhan(Yuhan yuhan) {
		this.yuhan = yuhan;
	}
	
	public void yuhanCall() {
		System.out.println("3Grade 2nd");
		this.yuhan.display();
	}
	
		
}
