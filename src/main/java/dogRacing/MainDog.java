package dogRacing;

import utils.Console;

import java.util.*;

public class MainDog {
    
    public static void main(String args[]) {
        Console console = Console.getInstance();

        console.writeln("Welcome to the first Dog Race");
        String d1n = console.readString("Input a name for your pet: ");
        String d1b = console.readString("Input the breed of your dog: ");
        Dog d1 = new Dog(d1n, d1b);
		String d2n = console.readString("Input a name for your pet: ");
		String d2b = console.readString("Input the breed of your dog: ");
        Dog d2 = new Dog(d2n, d2b);
        String winner = "";
        String loser = "";
        console.writeln(d1.getDogName() + " has a speed of: " + d1.getDogSpeed());
        console.writeln(d2.getDogName() + " has a speed of: " + d2.getDogSpeed());

        if (d1.getDogSpeed() > d2.getDogSpeed()) {
            console.writeln(d1.getDogName() + " is the fastest dog");
            winner = d1.getDogName();
            loser = d2.getDogName();
        } else if ((d2.getDogSpeed() > d1.getDogSpeed())) {
            console.writeln(d2.getDogName() + " is the fastest dog");
            winner = d2.getDogName();
            loser = d1.getDogName();
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
	
