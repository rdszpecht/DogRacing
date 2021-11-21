package dogRacing.dogs;

import dogRacing.dogs.Dog;

public class Doberman extends Dog {
    private final int RAN_FACTOR = 2;
    private final int EXTRA_SPEED = 8;

    private String name;
    private double speed;

    public Doberman(String name){
        this.name = name;
        this.speed = calculateSpeed();
    }

    private double calculateSpeed(){
        return (Math.random() * (RAN_FACTOR)) + EXTRA_SPEED;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
