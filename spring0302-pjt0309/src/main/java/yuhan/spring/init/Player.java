package yuhan.spring.init;

import java.util.ArrayList;

import org.springframework.beans.factory.InitializingBean;

public class Player implements InitializingBean{
	
	private String name;
	private int age;
	private ArrayList<String> position;
	private double weight;
	private double height;
	
	public Player(String name, int age, ArrayList<String> position) {
		this.name = name;
		this.position = position;
		this.age = age;	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<String> position) {
		this.position = position;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
