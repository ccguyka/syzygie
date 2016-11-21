package org.ccguyka.syzygie.assertions;

import org.assertj.core.api.Assertions;
import org.ccguyka.syzygie.Game;
import org.ccguyka.syzygie.Player;

public class GameAssert {

    private final Game actual;

    private GameAssert(Game actual) {
        this.actual = actual;
    }

    public static GameAssert assertThat(Game actual) {
        return new GameAssert(actual);
    }

    public GameAssert hasNoPlayers() {
        Assertions.assertThat(actual.hasPlayers()).isFalse();

        return this;
    }

    public GameAssert hasPlayers(Player... players) {
        Assertions.assertThat(actual.getPlayers()).contains(players);

        return this;
    }

    public GameAssert isInRound(int round) {
        Assertions.assertThat(actual.round()).isEqualTo(round);

        return this;
    }
}
