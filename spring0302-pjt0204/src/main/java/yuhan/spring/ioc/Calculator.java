package yuhan.spring.ioc;

public class Calculator {
	
	int result;
	
	public void addtion(int f, int s) {
		result = f + s;
		System.out.println("add : " + result);
	}
	
	public void substraction(int f, int s) {
		result = f - s;
		System.out.println("sub : " + result);
	}
	
	public void Multiplication(int f, int s) {
		result = f * s;
		System.out.println("mul : " + result);
	}
	
	public void Division(int f, int s) {
		result = f / s;
		System.out.println("div : " + result);
	}

}
