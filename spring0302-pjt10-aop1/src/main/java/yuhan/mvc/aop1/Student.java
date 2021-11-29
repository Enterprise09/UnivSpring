package yuhan.mvc.aop1;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNum;
	
	public void getStudentInfo() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반 : " + this.getClassNum());
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}	

}
