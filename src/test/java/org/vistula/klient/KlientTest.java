package org.vistula.klient;

import org.junit.Test;

public class KlientTest {

    @Test
    public void shouldBeWoman() {
        Klient aneta = new Klient();
        aneta.setWoman(true);
        assert aneta.amIWoman() == true;
    }

    @Test
    public void shouldBeMan() {
        Klient facet = new Klient();
        facet.setWoman(false);
        assert facet.amIWoman() == false;
    }

    @Test
    public void shouldBeShort() {
        Klient aga = new Klient();
        aga.setHeight(149);
        assert aga.isShort() == true;
    }

    @Test
    public void shouldBeEligibile() {
        Klient hipster = new Klient();
        hipster.setWoman(false);
        hipster.setHeight(171);
        hipster.setWeight(70);

        assert hipster.isEligibileForPromo() == true;
    }




}
