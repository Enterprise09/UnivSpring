package yuhan.spring.ioc;

public class MyCalculator {

	Calculator calc;
	private int first;
	private int second;
	
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void add() {
		calc.addtion(first, second);
	}
	
	public void sub() {
		calc.substraction(first, second);
	}
	
	public void mul() {
		calc.multiplication(first, second);
	}
	
	public void div() {
		calc.division(first, second);
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

	public Calculator getCalc() {
		return calc;
	}

	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	
	
	
}
