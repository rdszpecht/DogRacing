package dogRacing;

import dogRacing.dogs.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DogTest {

    private Dog dog;

    @BeforeEach
    public void beforeEach(){
        this.dog = new Dog();
    }

    @Test
    public void testGivenNewEmptyConstructorDogThenHasUnknownName(){
        assertTrue(this.dog.getName() == "Unknown");
    }

    @Test
    public void testGivenNewEmptyConstructorDogThenHasSpeed(){
        assertTrue(this.dog.getSpeed() > 0.0);
    }

    @Test
    public void testWhenNewDogThenNameIsSameAsIntroduced(){
        assertTrue(new Dog("Pedrito", "Doberman").getName() == "Pedrito");
    }


    @Test
    public void testGivenDogThenHasSpeed(){
        assertTrue(new Dog("Pedrito", "Doberman").getSpeed() > 0.0);
    }

}
