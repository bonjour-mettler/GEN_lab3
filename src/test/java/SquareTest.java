import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void aSquareShouldReturnCorrectName(){
        Square test = new Square("Jail");
        assertEquals("Jail", test.getName());
    }

}