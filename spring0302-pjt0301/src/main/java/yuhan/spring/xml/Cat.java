package yuhan.spring.xml;

public class Cat implements AnimalType {
	
	private String myName;
	
	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Cat : " + myName + " >> ¾ß ~ ¿Ë");

	}

}
