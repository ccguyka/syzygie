package org.ccguyka.syzygie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PlayerTest {

    private static final String ANY_NAME = "John";

    @Test
    public void verifyPlayerHasAName() throws Exception {
        Player player = new Player(ANY_NAME);

        assertThat(player.getName()).isEqualTo(ANY_NAME);
    }
}
