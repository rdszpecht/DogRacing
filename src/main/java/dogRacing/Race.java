package dogRacing;

import dogRacing.Prices.Price;
import dogRacing.dogs.Dog;
import dogRacing.dogs.DogBuilder;
import dogRacing.utils.Message;
import utils.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {

    private Console console;
    private List<Dog> dogs = new ArrayList<>();
    private final int NUMBER_DOGS = 2;
    private Price price;

    public Race(){
        this.console = Console.getInstance();
        this.price = new Price();
    }

    public void celebrateCompetition(){
        signInDogs();
        runRace();
        racingFinale();
    }

    public void runRace(){
        Collections.sort(dogs);
        Collections.reverse(dogs);

        if (dogs.get(0).getSpeed() == dogs.get(1).getSpeed()) {
            console.writeln(Message.DRAW.toString());
        }else{
            console.writeln(dogs.get(0).getName() + " " + Message.FASTEST_DOG);
        }
    }

    private void racingFinale(){
        winnerPriceSelection();

        console.writeln(dogs.get(0).getName() + Message.OBTAINED + this.dogs.get(0).getPrice() + Message.WINNER_PRICE);
        console.writeln(dogs.get(1).getName() + Message.LOSER_PRICE);
        console.writeln(Message.GOODBYE.toString());
    }

    private void signInDogs() {
        console.writeln(Message.WELCOME.toString());

        for (int i = 0; i < NUMBER_DOGS; i++) {
            String dogName = console.readString(Message.NAME_SELECT.toString());
            String dogBreed = console.readString(Message.BREED_SELECT.toString());
            dogs.add(DogBuilder.newDog(dogName, dogBreed));
        }
        for (int i = 0; i < NUMBER_DOGS; i++) {
            console.writeln(dogs.get(i).getName() + Message.SPEED_OF + dogs.get(i).getSpeed());
        }
    }


    private void winnerPriceSelection() {
        console.write(Message.RECOGNITION + dogs.get(0).getName());
        console.writeln(Message.WINNER.toString());
        this.price.printAvaiablePrices();

        this.dogs.get(0).setPrice(price.selectSpecialPrice());
    }


    public List<Dog> getDogs() {
        return dogs;
    }

}
