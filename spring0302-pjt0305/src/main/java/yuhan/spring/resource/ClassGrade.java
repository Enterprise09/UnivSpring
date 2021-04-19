package yuhan.spring.resource;

import javax.annotation.Resource;

public class ClassGrade {
	
	private int num1;
	
	
	private int num2;
	
	
	public int getNum1() {
		return num1;
	}
	
	@Resource(name="num1")
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	
	@Resource(name="num2")
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void display() {
		System.out.println("2반 등급 : " + num1);
		System.out.println("1반 등급 : " + num2);
		System.out.println("동급입니다.");
	}
	
	
	

}
