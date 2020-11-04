import org.junit.Test;

import static org.junit.Assert.*;

public class OXTest {


    @Test
    public void create_new_game() {
        GameManager gameManager = new GameManager();
        Game newGame = gameManager.newGame();

        // Verify result
        assertNull(newGame);
        assertNotNull(newGame.getPlayer1());
        assertNotNull(newGame.getPlayer2());
        assertNotNull(newGame.getBoard());
    }


}
