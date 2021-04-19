package yuhan.spring.qualify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	@Qualifier("yuhan01")	
	private Bolpen bolpen;

	public Bolpen getBolpen() {
		return bolpen;
	}

	public void setBolpen(Bolpen bolpen) {
		this.bolpen = bolpen;
	}
	
	public void useStudent() {
		System.out.println("∫º∆Ê¿∫ JetStream");
		this.bolpen.display();
	}
	
	
}
