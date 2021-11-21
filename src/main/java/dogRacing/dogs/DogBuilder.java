package dogRacing.dogs;

import java.util.Locale;

public abstract class DogBuilder {

    public static Dog newDog(String name, String breed){
        switch (breed.toLowerCase(Locale.ROOT)) {
            case "greyhound":
                return new Greyhound(name);

            case "retriever":
                return new Retriever(name);

            case "bordercolie":
                return new Bordercolie(name);

            case "doberman":
                return new Doberman(name);

            case "dalmatian":
                return new Dalmatian(name);

            default :
                return new MixedBreed(name);
        }
    }
    public static Dog newDog(){
        return new MixedBreed("Unknown");
    }
}
