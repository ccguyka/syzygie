package org.ccguyka.syzygie;

import java.util.Objects;

public class Player {

    private final String name;
    private final PlayerColor color;

    public Player(String name, PlayerColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public PlayerColor getColor() {
        return color;
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof Player)) {
            return false;
        }
        Player castOther = (Player) other;
        return Objects.equals(name, castOther.name) && Objects.equals(color, castOther.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

}
