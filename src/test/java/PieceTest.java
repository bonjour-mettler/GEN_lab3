import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    @Test
    void aPieceShouldRetrieveAGoodName(){
        Piece test = new Piece("test", null);
        assertEquals("test", test.getName());
    }

    @Test
    void aPieceShouldRetrieveAGoodLocationAndName(){
        RegularSquare sq = new RegularSquare("Square Test");
        Piece test = new Piece("test", sq);
        assertEquals("test", test.getName());
        assertEquals("Square Test", test.getLocation().getName());
    }

    @Test
    void aPieceShouldChangeLocationCorrectly(){
        Board boardTest = new Board();
        Piece test = new Piece("test", boardTest.getGo());
        for(int i = 0; i < 40; ++i){
            Square newLoc = boardTest.getSquare(boardTest.getGo(), i);
            test.setLocation(newLoc);
            assertEquals(newLoc, test.getLocation());
        }
        assertEquals("test", test.getName());
    }

}