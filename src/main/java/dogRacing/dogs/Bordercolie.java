package dogRacing.dogs;

public class Bordercolie extends Dog{

    private final int RAN_FACTOR = 3;
    private final int EXTRA_SPEED = 7;

    private String name;
    private double speed;

    public Bordercolie(String name) {
        this.name = name;
        this.speed = calculateSpeed();
    }

    private double calculateSpeed() {
        return (Math.random() * (RAN_FACTOR)) + EXTRA_SPEED;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

}