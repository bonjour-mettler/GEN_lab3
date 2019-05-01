import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @RepeatedTest(20)
    void aDieShouldRollBetween1And6() {
        Die die = new Die();
        die.roll();
        int low = 1;
        int high = 6;
        //assertTrue n'est pas reconnu ?
        assertEquals(true, high >= die.getFaceValue());
        assertEquals(true, low <= die.getFaceValue());
    }
}