import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    @Test
    void aPieceShouldRetrieveAGoodName(){
        Piece test = new Piece("test", null);
        assertEquals("test", test.getName());
    }
}