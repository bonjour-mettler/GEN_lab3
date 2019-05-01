import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {
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
    public void aPlayerShouldHaveDifferentAmountOfMoney(){
        ArrayList<Square> squares = board.getSquares();
        int previousMoney = player.getNetWorth();
        squares.get(20).landedOn(player);
        assertNotEquals(previousMoney, player.getNetWorth());
    }
}