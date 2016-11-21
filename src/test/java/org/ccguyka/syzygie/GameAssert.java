package org.ccguyka.syzygie;

import org.assertj.core.api.Assertions;

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

    public GameAssert hasPlayers(int number) {
        Assertions.assertThat(actual.getPlayers()).hasSize(number);

        return this;
    }

    public GameAssert isInRound(int round) {
        Assertions.assertThat(actual.round()).isEqualTo(round);

        return this;
    }
}
