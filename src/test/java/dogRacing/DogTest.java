package dogRacing;

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
        assertTrue(this.dog.getDogName() == "Unknown");
    }

    @Test
    public void testGivenNewEmptyConstructorDogThenHasSpeed(){
        assertTrue(this.dog.getDogSpeed() > 0.0);
    }

    @Test
    public void testWhenNewDogThenNameIsSameAsIntroduced(){
        assertTrue(new Dog("Pedrito", "Doberman").getDogName() == "Pedrito");
    }


    @Test
    public void testGivenDogThenHasSpeed(){
        assertTrue(new Dog("Pedrito", "Doberman").getDogSpeed() > 0.0);
    }

}
