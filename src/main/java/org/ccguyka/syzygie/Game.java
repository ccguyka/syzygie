package org.ccguyka.syzygie;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Player> players = new ArrayList<>();

    public boolean hasPlayers() {
        return false;
    }

    public void add(Player player) {
        checkColorIsUsedOnlyOnce(player);
        players.add(player);
    }

    private void checkColorIsUsedOnlyOnce(Player player) {
        for (Player existingPlayer : players) {
            if (existingPlayer.getColor().equals(player.getColor())) {
                throw new IllegalArgumentException("Color " + player.getColor() + " already used by another player");
            }
        }
    }

    public List<Player> getPlayers() {
        return unmodifiableList(players);
    }

    public int round() {
        return 0;
    }
}
