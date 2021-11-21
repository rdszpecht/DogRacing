package dogRacing.dogs;

public abstract class Dog implements Comparable<Dog>{
	private String name;
	private double speed;
	
	public String getName() {
		return name;
	}
	
	
	public double getSpeed() {
		return speed;
	}

	@Override
	public int compareTo(Dog dog) {
		int result = 0;

		if(dog.getSpeed() > this.speed){
			result = -1;
		}

		if(this.speed > dog.getSpeed()){
			result = 1;
		}

		return result;
	}
}
	
	
