import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void aPlayerShouldKnowHisName(){
        Player jean = new Player("Jean");
        assertEquals("Jean", jean.getName());
    }

}