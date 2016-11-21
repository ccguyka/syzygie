package org.ccguyka.syzygie;

import org.assertj.core.api.Assertions;

public class PlayerAssert {

    private final Player actual;

    private PlayerAssert(Player actual) {
        this.actual = actual;
    }

    public static PlayerAssert assertThat(Player actual) {
        return new PlayerAssert(actual);
    }

    public PlayerAssert hasName(String name) {
        Assertions.assertThat(actual.getName()).isEqualTo(name);

        return this;
    }

    public PlayerAssert hasColor(PlayerColor color) {
        Assertions.assertThat(actual.getColor()).isEqualTo(color);

        return this;
    }

}
