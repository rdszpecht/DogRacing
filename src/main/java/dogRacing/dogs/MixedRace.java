package dogRacing.dogs;

public class MixedRace extends Dog{
    private final int RAN_FACTOR = 1;
    private final int EXTRA_SPEED = 9;

    private String name;
    private double speed;

    public MixedRace(String name){
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

