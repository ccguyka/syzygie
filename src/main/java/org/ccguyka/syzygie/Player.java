package org.ccguyka.syzygie;

import java.util.Objects;

public class Player {

    private final String name;
    private final PlayerColor color;
    private final Race race;

    public Player(String name, PlayerColor color, Race race) {
        this.name = name;
        this.color = color;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public PlayerColor getColor() {
        return color;
    }

    public Race getRace() {
        return race;
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof Player)) {
            return false;
        }
        Player castOther = (Player) other;
        return Objects.equals(name, castOther.name) && Objects.equals(color, castOther.color)
                && Objects.equals(race, castOther.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, race);
    }


}
