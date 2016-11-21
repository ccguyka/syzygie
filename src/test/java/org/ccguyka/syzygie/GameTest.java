package org.ccguyka.syzygie;

import static com.googlecode.catchexception.CatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.then;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.ccguyka.syzygie.PlayerColor.GREEN;
import static org.ccguyka.syzygie.PlayerColor.RED;
import static org.ccguyka.syzygie.Race.HUMAN;
import static org.ccguyka.syzygie.assertions.GameAssert.assertThat;

import org.junit.Test;

public class GameTest {

    private static final Player JANE = new Player("Jane", GREEN, HUMAN);
    private static final Player JOHN = new Player("John", RED, HUMAN);

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

    @Test
    public void verifyPlayerColorCannotBeUsedTwice() throws Exception {
        Game game = new Game();
        game.add(new Player("John", GREEN, HUMAN));

        when(game).add(new Player("Jane", GREEN, HUMAN));

        then(caughtException()).isInstanceOf(IllegalArgumentException.class);
    }

}
