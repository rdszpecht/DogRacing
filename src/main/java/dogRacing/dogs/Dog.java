package dogRacing.dogs;

public class Dog {
	private String name;
	private String breed;
	private double speed;
	
	public Dog() {
		this.name = "Unknown";
		this.breed = "Mixed race";
		this.speed = breedSpeed();
	}

	public Dog(String name, String breed) {

		this.name = name;
		this.breed = breed;
		this.speed = breedSpeed();
	}
	private double breedSpeed() {
		switch (this.breed) {
			case "greyhound":
				return speed =(Math.random()*(10-9))+9;

			case "retriever":
				return speed =(Math.random()*(10-7))+7;

			case "bordercolie":
				return speed =(Math.random()*(10-7))+7;

			case "doberman":
				return speed =(Math.random()*(10-8))+8;

			case "dalmatian":
				return speed =(Math.random()*(10-8))+8;

			default :
				return speed =(Math.random()*(10-9))+9;
		}
	}
	
	public String getDogName() {
		return name;
	}
	
	
	public double getDogSpeed() {
		return speed;
	}
}
	
	
