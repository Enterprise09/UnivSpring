package yuhan.spring.resource;

public class Number {
	
	private int number;	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {		
		return "[number = " + number + "]";
	}
	
	

}
