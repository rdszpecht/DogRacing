package dogRacing;

import dogRacing.dogs.Dog;
import dogRacing.dogs.DogBuilder;
import utils.Console;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Console console;
    private List<Dog> dogs = new ArrayList<>();
    private final int NUMBER_DOGS = 2;

    public Race(){
        this.console = Console.getInstance();
    }

    public void runRace(){
        console.writeln("Welcome to the first Dog Race");
        
        for (int i = 0; i < NUMBER_DOGS; i++) {
            String dogName = console.readString("Input a name for your pet: ");
            String dogBreed = console.readString("Input the breed of your dog: ");
            dogs.add(DogBuilder.newDog(dogName, dogBreed));

            console.writeln(dogs.get(i).getName() + " has a speed of: " + dogs.get(i).getSpeed());
        }

        String winner = "";
        String loser = "";

        if (dogs.get(0).getSpeed() > dogs.get(1).getSpeed()) {
            console.writeln(dogs.get(0).getName() + " is the fastest dog");
            winner = dogs.get(0).getName();
            loser = dogs.get(1).getName();
        } else if ((dogs.get(1).getSpeed() > dogs.get(0).getSpeed())) {
            console.writeln(dogs.get(1).getName() + " is the fastest dog");
            winner = dogs.get(1).getName();
            loser = dogs.get(0).getName();
        } else {
            console.writeln("Both dogs are equally as fast");

        }

        console.writeln("As a recognition for " + winner + ", winner of the race, he can chose a special price");
        console.writeln("1. Pack of ropes to pull");
        console.writeln("2. Dog bed");
        console.writeln("3. Pack of balls");
        console.writeln("4. Dog bottle of water");
        String winnerprice = "";
        int optionwinner = console.readInt("");
        switch (optionwinner) {
            case 1:
                winnerprice = "Pack of ropes to pull";
                break;
            case 2:
                winnerprice = "Dog bed";
                break;
            case 3:
                winnerprice = "Pack of balls";
                break;
            default:
                winnerprice = "Dog bottle of water";
        }

        console.writeln(winner + " has obtained " + winnerprice + " as a reward for him winning, also a special signature bowl!");
        console.writeln(loser + " also wins a special signature bowl for his great performance!");

        console.writeln("Thanks for participating!!");

    }
}
