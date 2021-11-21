package dogRacing.dogs;

import dogRacing.Prices.Price;

public abstract class Dog implements Comparable<Dog>{
	private String name;
	private double speed;
	private String price;
	
	public String getName() {
		return name;
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
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
	
	
