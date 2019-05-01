import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void aSquareShouldReturnCorrectName(){
        RegularSquare test = new RegularSquare("Jail");
        assertEquals("Jail", test.getName());
    }

}