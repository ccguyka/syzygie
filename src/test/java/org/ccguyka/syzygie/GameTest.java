package org.ccguyka.syzygie;

import static org.ccguyka.syzygie.GameAssert.assertThat;
import static org.ccguyka.syzygie.PlayerColor.GREEN;
import static org.ccguyka.syzygie.PlayerColor.RED;

import org.junit.Test;

public class GameTest {

    private static final Player JANE = new Player("Jane", GREEN);
    private static final Player JOHN = new Player("John", RED);

    @Test
    public void verifyInitalGameState() throws Exception {
        Game game = new Game();

        assertThat(game)
            .hasNoPlayers()
            .isInRound(0);
    }

    @Test
    public void verifyTwoPlayerGame() throws Exception {
        Game game = new Game();

        game.add(JOHN);
        game.add(JANE);

        assertThat(game)
            .hasPlayers(JOHN, JANE);
    }

}
