package org.ccguyka.syzygie;

import static org.ccguyka.syzygie.PlayerAssert.assertThat;
import static org.ccguyka.syzygie.PlayerColor.RED;

import org.junit.Test;

public class PlayerTest {

    private static final String JOHN = "John";

    @Test
    public void verifyPlayerInitialState() throws Exception {
        Player player = new Player(JOHN, RED);

        assertThat(player)
                .hasName(JOHN)
                .hasColor(RED);
    }
}
