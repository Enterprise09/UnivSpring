package yuhan.spring.cont;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private String height;
	private String weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalc;	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBmiCalc() {
		return bmiCalc;
	}
	public void setBmiCalc(BMICalculator bmiCalc) {
		this.bmiCalc = bmiCalc;
	}		
	
	
	public void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
		System.out.println("Hobbys : " + hobbys);
	}
	
	
	
	
	
}
