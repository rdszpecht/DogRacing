package dogRacing;

import dogRacing.Prices.SpecialPrice;
import dogRacing.dogs.Dog;
import dogRacing.dogs.DogBuilder;
import utils.Console;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Console console;
    private List<Dog> dogs = new ArrayList<>();
    private final int NUMBER_DOGS = 2;
    private String winner, loser, winnerprice;
    private SpecialPrice specialPrice;

    public Race(){
        this.console = Console.getInstance();
        this.specialPrice = new SpecialPrice();
    }

    public void runRace(){
        welcomeMessage();

        createDogs();

        competeInRace();

        winnerPriceSelection();

        prices();

        finale();
    }

    private void finale() {
        console.writeln("Thanks for participating!!");
    }

    private void prices() {
        console.writeln(winner + " has obtained " + winnerprice + " as a reward for him winning, also a special signature bowl!");
        console.writeln(loser + " also wins a special signature bowl for his great performance!");
    }

    private void competeInRace() {
        winner = "";
        loser = "";

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
    }

    private void winnerPriceSelection() {
        console.writeln("As a recognition for " + winner + ", winner of the race, he can chose a special price");
        this.specialPrice.printAvaiablePrices();

        winnerprice = "";
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
    }

    private void createDogs() {
        for (int i = 0; i < NUMBER_DOGS; i++) {
            String dogName = console.readString("Input a name for your pet: ");
            String dogBreed = console.readString("Input the breed of your dog: ");
            dogs.add(DogBuilder.newDog(dogName, dogBreed));
        }
        for (int i = 0; i < NUMBER_DOGS; i++) {
            console.writeln(dogs.get(i).getName() + " has a speed of: " + dogs.get(i).getSpeed());
        }
    }

    private void welcomeMessage() {
        console.writeln("Welcome to the first Dog Race");
    }
}
