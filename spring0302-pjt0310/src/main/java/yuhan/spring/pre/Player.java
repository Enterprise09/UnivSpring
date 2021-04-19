package yuhan.spring.pre;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Player {
	
	private String name;
	private int age;
	private ArrayList<String> position;
	private double height;
	private double weight;
	
	

	public Player(String name, int age, ArrayList<String> position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	@PostConstruct
	public void yuhanMethod() {
		System.out.println("@PostConstruct 按眉 积己窍扁 ~~");
		
	}
	
	@PreDestroy
	public void yuhanMethod1() {
		System.out.println("@PreDestory 按眉 家戈窍扁 ~~");
		
	}
	
	

}
