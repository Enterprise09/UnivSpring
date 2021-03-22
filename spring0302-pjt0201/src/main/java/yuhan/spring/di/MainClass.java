package yuhan.spring.di;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("FirstNumber : ");
		int num1 = sc.nextInt();
		calc.setFirstNum(num1);
		
		System.out.print("SecondNumber : ");
		int num2 = sc.nextInt();
		calc.setSecondNum(num2);

		System.out.println("Choose Process");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Div");
		System.out.println("4. Mul");
		int p = sc.nextInt();
		int result = 0;
		
		switch (p) {
		case 1:
			calc.add();
			break;
		case 2:
			calc.sub();
			break;
		case 3:
			calc.div();
			break;
		case 4:
			calc.mul();
			break;

		default:
			System.out.println("Wrong Process Number");
			break;
		}
		
	}

}
