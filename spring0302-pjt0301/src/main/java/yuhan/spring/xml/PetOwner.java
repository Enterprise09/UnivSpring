package yuhan.spring.xml;

public class PetOwner {
	
	public AnimalType animalType;
	
	public PetOwner(AnimalType animal) {			
		this.animalType = animal;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}
	
	public void play() {
		System.out.println("Play Time");
		animalType.sound();
	}

}
