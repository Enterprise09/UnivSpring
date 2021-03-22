package yuhan.spring.ioc;

public class Calculator {
	
	int result;
	
	public Calculator() {
		
		
	}
	
	public void addtion(int f, int s) {
		result = f + s;
		System.out.println("add : " + result);
	}
	
	public void substraction(int f, int s) {
		result = f - s;
		System.out.println("sub : " + result);
	}
	
	public void multiplication(int f, int s) {
		result = f * s;
		System.out.println("mul : " + result);
	}
	
	public void division(int f, int s) {
		result = f / s;
		System.out.println("div : " + result);
	}

}
