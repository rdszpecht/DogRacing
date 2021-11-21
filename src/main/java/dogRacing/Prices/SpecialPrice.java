package dogRacing.Prices;

import utils.Console;

import java.util.HashMap;
import java.util.Map;

public class SpecialPrice {
    private String[] priceNames = {"Pack of ropes to pull", "Dog bed", "Pack of balls", "Dog bottle of water"};
    private Map<Integer, String> prices = new HashMap<>();

    public SpecialPrice(){
        int priceNumber = 1;
        for(String priceName: priceNames){
            prices.put(priceNumber, priceName);
            priceNumber++;
        }
    }

    public void printAvaiablePrices(){
        Console console = Console.getInstance();
        for(Map.Entry<Integer, String> entry: prices.entrySet()){
            console.writeln(entry.getKey() + ". " + entry.getValue());
        }
    }
}
