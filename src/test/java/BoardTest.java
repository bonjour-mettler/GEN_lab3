import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    public void aBoardShouldNeverBeEmpty(){
        Board board = new Board();
        assertNotNull(board);
    }
}