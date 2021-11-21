package dogRacing.dogs;

public abstract class DogBuilder {

    public static Dog newDog(String name, String breed){
        switch (breed) {
            case "greyhound":
                return new Dog(name, breed);

            case "retriever":
                return new Dog(name, breed);

            case "bordercolie":
                return new Dog(name, breed);

            case "doberman":
                return new Doberman(name);

            case "dalmatian":
                return new Dog(name, breed);

            default :
                return new Dog(name, breed);
        }
    }
}
