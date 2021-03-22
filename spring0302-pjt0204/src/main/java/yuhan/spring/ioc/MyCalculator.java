package yuhan.spring.ioc;

import java.util.Scanner;

public class MyCalculator {
	Calculator calculator = new Calculator();
	private int first, second;
	Scanner s = new Scanner(System.in);
	
	public MyCalculator() {
		
		System.out.println("First Number : ");
		first = s.nextInt();
		
		System.out.println("Second Number : ");
		second = s.nextInt();
		
		add();
		sub();
		mul();
		div();
		
	}
	
	
	public void add() {
		calculator.addtion(first, second);
	}
	
	public void sub() {
		calculator.substraction(first, second);
	}
	
	public void mul() {
		calculator.Multiplication(first, second);
	}
	
	public void div() {
		calculator.Division(first, second);
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
	
	
}
