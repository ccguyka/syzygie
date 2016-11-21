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
        players.add(player);
    }

    public List<Player> getPlayers() {
        return unmodifiableList(players);
    }

    public int round() {
        return 0;
    }
}
