package dogRacing;

    import dogRacing.dogs.Dog;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

    import org.junit.jupiter.api.extension.ExtendWith;
    import org.mockito.*;
    import org.mockito.junit.jupiter.MockitoExtension;
    import utils.Console;

    import static org.mockito.ArgumentMatchers.anyString;
    import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MainDogTest {

    @Mock
    private Console console;

    @Mock
    private Dog fastestDog;

    @Mock
    private Dog slowestDog;

    private MainDog mainDog;
    private String[] args;

    @BeforeEach
    public void beforeEach(){
        this.args = new String[1];
        this.mainDog = new MainDog();

        this.fastestDog = new Dog("Assasin", "greyhound");
        this.slowestDog = new Dog("Slowbro", "dalmatian");
    }

    @Test
    public void testGivenNewMainDogAndMainThenPrint12Lines(){
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.mainDog.main(this.args);

            verify(this.console, times(12)).writeln(anyString());
        }
    }

    @Test
    public void testGivenNewMainDogAndMainThenPrintWelcome(){
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.mainDog.main(this.args);

            verify(this.console).writeln("Welcome to the first Dog Race");
        }
    }

    @Test
    public void testGivenNewMainDogAndMainThenPrintGoodbye(){
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.mainDog.main(this.args);

            verify(this.console).writeln("Thanks for participating!!");
        }
    }

    @Test
    public void testGivenNewMainDogAndMainThenADogWinsTheSpecialPrice(){
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.mainDog.main(this.args);
            verify(this.console).writeln("Scooby has obtained Pack of balls as a reward for him winning, also a special signature bowl!");
        }
    }

    @Test
    public void testGivenNewMainDogAndMainThenLoserDogWinsTheParticipationPrice(){
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.mainDog.main(this.args);
            verify(this.console).writeln("Scooby also wins a special signature bowl for his great performance!");
        }
    }

}
