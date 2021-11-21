package dogRacing;

import dogRacing.dogs.Dog;
import dogRacing.dogs.DogBuilder;
import utils.Console;

public class Race {

    private Console console;

    public Race(){
        this.console = Console.getInstance();
    }

    public void runRace(){
        console.writeln("Welcome to the first Dog Race");
        String d1n = console.readString("Input a name for your pet: ");
        String d1b = console.readString("Input the breed of your dog: ");
        Dog d1 = DogBuilder.newDog(d1n, d1b);
        String d2n = console.readString("Input a name for your pet: ");
        String d2b = console.readString("Input the breed of your dog: ");
        Dog d2 = DogBuilder.newDog(d2n, d2b);
        String winner = "";
        String loser = "";
        console.writeln(d1.getName() + " has a speed of: " + d1.getSpeed());
        console.writeln(d2.getName() + " has a speed of: " + d2.getSpeed());

        if (d1.getSpeed() > d2.getSpeed()) {
            console.writeln(d1.getName() + " is the fastest dog");
            winner = d1.getName();
            loser = d2.getName();
        } else if ((d2.getSpeed() > d1.getSpeed())) {
            console.writeln(d2.getName() + " is the fastest dog");
            winner = d2.getName();
            loser = d1.getName();
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
