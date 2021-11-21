package DogRacing;

import java.util.*;

public class MainDog {

    public static void main(String args[]) {
        System.out.println("Welcome to the first Dog Race");
        Scanner data = new Scanner(System.in);
        System.out.println("Input a name for your pet");
        String d1n = data.next();
        System.out.println("Input the breed of your dog");
        String d1b = data.next();
        Dog d1 = new Dog(d1n, d1b);
		System.out.println("Input a name for your pet");
        String d2n = data.next();
		System.out.println("Input the breed of your dog");
        String d2b = data.next();
        Dog d2 = new Dog(d2n, d2b);
        String winner = "";
        String loser = "";
        System.out.println(d1.getDogName() + " has a speed of: " + d1.getDogSpeed());
        System.out.println(d2.getDogName() + " has a speed of: " + d2.getDogSpeed());

        if (d1.getDogSpeed() > d2.getDogSpeed()) {
            System.out.println(d1.getDogName() + " is the fastest dog");
            winner = d1.getDogName();
            loser = d2.getDogName();
        } else if ((d2.getDogSpeed() > d1.getDogSpeed())) {
            System.out.println(d2.getDogName() + " is the fastest dog");
            winner = d2.getDogName();
            loser = d1.getDogName();
        } else {
            System.out.println("Both dogs are equally as fast");

        }

        System.out.println("As a recognition for " + winner + " ,winner of the race, he can chose a special price");
        System.out.println("1. Pack of ropes to pull");
        System.out.println("2. Dog bed");
        System.out.println("3. Pack of balls");
        System.out.println("4. Dog bottle of water");
        String winnerprice = "";
        int optionwinner = data.nextInt();
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

        System.out.println(winner + " has obtained " + winnerprice + " as a reward for him winning, also a special signature bowl!");
        System.out.println(loser + " also wins a special signature bowl for his great performance!");

        System.out.println("Thanks for participating!!");
        data.close();
    }
}
	
