package org.ccguyka.syzygie;

import static org.ccguyka.syzygie.PlayerColor.RED;
import static org.ccguyka.syzygie.Race.HUMAN;
import static org.ccguyka.syzygie.assertions.PlayerAssert.assertThat;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PlayerTest {

    private static final String JOHN = "John";

    @Test
    public void verifyPlayerInitialState() throws Exception {
        Player player = new Player(JOHN, RED, HUMAN);

        assertThat(player)
                .hasName(JOHN)
                .hasColor(RED)
                .hasRace(HUMAN);
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Player.class)
                .suppress(Warning.STRICT_INHERITANCE)
                .verify();
    }
}
