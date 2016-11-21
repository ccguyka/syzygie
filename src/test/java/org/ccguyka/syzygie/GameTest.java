package org.ccguyka.syzygie;

import static org.ccguyka.syzygie.GameAssert.assertThat;

import org.junit.Test;

public class GameTest {

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

        game.add(new Player());
        game.add(new Player());

        assertThat(game)
            .hasPlayers(2);
    }

}
