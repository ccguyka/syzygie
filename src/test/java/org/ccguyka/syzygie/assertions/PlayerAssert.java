package org.ccguyka.syzygie.assertions;

import org.assertj.core.api.Assertions;
import org.ccguyka.syzygie.Player;
import org.ccguyka.syzygie.PlayerColor;
import org.ccguyka.syzygie.Race;

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

    public PlayerAssert hasRace(Race race) {
        Assertions.assertThat(actual.getRace()).isEqualTo(race);

        return this;
    }

}
