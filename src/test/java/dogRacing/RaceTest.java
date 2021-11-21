package dogRacing;

import dogRacing.dogs.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.*;
import utils.Console;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class RaceTest {
    @Mock
    private Console console;

    private Dog fastestDog, slowestDog;

    private Race race;

    @BeforeEach
    public void beforeEach(){
        this.race = spy(new Race());
    }

    @Test
    public void testGivenRaceWhenCompeteThenFastestDogWins() {
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.console.readInt(anyString())).thenReturn(3);
            when(this.console.readString("Input a name for your pet: ")).thenReturn("Scooby");
            when(this.console.readString("Input the breed of your dog: ")).thenReturn("Doberman");

            this.race.runRace();

            assertTrue(this.race.getDogs().get(0).getSpeed() >= this.race.getDogs().get(1).getSpeed());
        }
    }
}
