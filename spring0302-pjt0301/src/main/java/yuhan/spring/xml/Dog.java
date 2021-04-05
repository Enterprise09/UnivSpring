package yuhan.spring.xml;

public class Dog implements AnimalType {

	private String myName;
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Dog : " + myName + " >> ¸Û¸Û¸Û");

	}

}
