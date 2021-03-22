package yuhan.spring.ioc;

public class MyCalculator {

	Calculator calculator;
	private int first;
	private int second;
	
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void add() {
		calculator.addtion(first, second);
	}
	
	public void sub() {
		calculator.substraction(first, second);
	}
	
	public void mul() {
		calculator.multiplication(first, second);
	}
	
	public void div() {
		calculator.division(first, second);
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	
	
	
}
