package org.vistula.client;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientTest {

    @Test
    public void clientWithTwoProducts() {
        ArrayList basket = new ArrayList();
        basket.add("Wine");
        basket.add("Beer");

        Client slawek =
                new Client("Slawek", 17, basket);

        assertThat(slawek.getBasket().size()).isEqualTo(2);
    }

    @Test
    public void shouldBeAdult() {
        Client slawek = new Client();
        slawek.setAge(19);

        assertThat(slawek.isAdult()).isTrue();
    }

    @Test
    public void shouldBeActiveByDefault() {
        Client slawek = new Client();
        assertThat(slawek.isActive()).isTrue();
    }

    @Test
    public void shouldBeAbleToInvalidateClient() {
        Client slawek = new Client();
        slawek.setActive(false);
        assertThat(slawek.isActive()).isFalse();
    }

    @Test
    public void shouldBeAbleToMakeClientActiveAgain() {
        Client slawek = new Client();
        slawek.setActive(false);
        slawek.setActive(true);
        assertThat(slawek.isActive()).isTrue();
    }

    @Test
    public void shouldIncreaseOrderCount() {
        // Given - Client with 2 products

        ArrayList basket = new ArrayList();
        basket.add("Wine");
        basket.add("Beer");

        Client slawek =
                new Client("Slawek", 17, basket);

        // When - we send order
        slawek.sendOrder();

        // Then - his order count equals 1
        assertThat(slawek.getOrderCount()).isEqualTo(1);
    }
}
