import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void aPlayerShouldKnowHisName(){
        Player jean = new Player("Jean");
        assertEquals("Jean", jean.getName());
    }

    @Test
    void aPlayerShouldHaveMovedAfterTakingTurn(){
        ArrayList<Player> joueurs = new ArrayList<Player>();
        Player pierre = new Player("Pierre");
        joueurs.add(new Player("Jean"));
        joueurs.add(pierre);

        MonopolyGame game = new MonopolyGame(joueurs);
        Square oldLoc = pierre.getOwns().getLocation();
        pierre.takeTurn();
        assertNotEquals(oldLoc.getName(), pierre.getOwns().getLocation().getName());
    }
}