package yuhan.spring.di;

public class Calculation {
	
	private int firstNum;
	private int SecondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return SecondNum;
	}
	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}
	
	
	public void add() {
		int result = firstNum + SecondNum;
		System.out.println("Add : " + result);
	}
	
	public void sub() {
		int result = firstNum - SecondNum;
		System.out.println("Sub : " + result);
	}
	
	public void div() {
		int result = firstNum / SecondNum;
		System.out.println("Div : " + result);
	}
	
	public void mul() {
		int result = firstNum * SecondNum;
		System.out.println("Mul : " + result);
	}
	
	
	
	
}
