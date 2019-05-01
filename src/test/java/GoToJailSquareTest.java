import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {
    Board board;
    Player player;

    @BeforeEach
    @Test
    void createEnvironmentBeforeEachTest(){
        board = new Board();
        player = new Player("Test player");
        player.setBoard(board);
        player.setPiece(new Piece("Test piece", board.getGo()));
        assertNotNull(board);
        assertNotNull(player);
    }

    @Test
    void theGoToJailSquareEffectivelyGoToJail(){
        ArrayList<Square> squares = board.getSquares();
        squares.get(30).landedOn(player);
        assertEquals(board.getPrison(),player.getOwns().getLocation());
    }

}