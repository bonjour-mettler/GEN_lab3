import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void aBoardShouldCreateCorrectSquares(){
        Board board = new Board();
        // We test 2 times the board
        for(int i = 0; i < 80; ++i) {
            if(i %40 == 0){
                assertEquals("Go", board.getGo().getName());
            } else {
                assertEquals("Square " + (i % 40), board.getSquare(board.getGo(), i).getName());
            }
        }
    }
    
    @Test
    void aBoardShouldRetrieveCorrectSquares(){
        Board board = new Board();
        ArrayList<Square> squares = board.getSquares();
        int i = 0;
        for(Square square : squares) {
            assertEquals(square, board.getSquare(board.getGo(), i));
            ++i;
        }
    }
}