package org.vistula.human;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class HumanTest {

    @Test
    public void myFirstTest() {
        Human slawek = new Human(19, "Slawek", "X");
        assert slawek.getAge() == 19;
    }

    @Test
    public void testEmptyConstructor() {
        Human jessica = new Human();
        jessica.setAge(19);
        assert jessica.getAge() == 19;
    }

    @Test
    public void verifyName() {
        Human slawek = new Human(19, "Slawek", "X");
        assert slawek.getFirstName() == "Slawek";
    }

    @Test
    public void verifyName2() {
        Human jessica = new Human();
        jessica.setFirstName("Jessica");
        assert jessica.getFirstName() == "Jessica";
    }

    @Test
    public void cantBuyAlco() {
        Human slawek = new Human();
        slawek.setAge(17);
        assert slawek.canBuyAlcohol() == false;
    }

    @Test
    public void canBuyAlcoBorder() {
        Human slawek = new Human();
        slawek.setAge(18);
        assert slawek.canBuyAlcohol() == true;
    }

    @Test
    public void canBuyAlco() {
        Human slawek = new Human();
        slawek.setAge(19);
        assertThat(slawek.canBuyAlcohol()).isTrue();
    }

    @Test
    public void shouldReturnCorrectHuman() {
        ArrayList<Human> humans = new ArrayList<>();
        Human jessica = new Human(18, "Jessica", "Alba");
        Human marek = new Human(10, "Marek", "Ren");

        humans.add(marek);
        humans.add(jessica);

        assertThat(humans.get(1).getAge()).isEqualTo(18);
    }

}
