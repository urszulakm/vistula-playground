package org.vistula.switchtest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchTest {

    @Test
    public void switchTest() {
        int zmienna = 3;

        switch (zmienna) {
            case 1:
                System.out.println("Liczba to 1");
                break;
            case 2:
                System.out.println("Liczba to 2");
                break;
            default:
                System.out.println("Liczba to ani 1, ani 2");
        }
    }

    @Test
    public void shouldBeGirl() {
        assertThat(determineSex("Ala")).isEqualTo("GIRL");
    }

    @Test
    public void shouldBeGirlUppercase() {
        assertThat(determineSex("ALA")).isEqualTo("GIRL");
    }

    @Test
    public void shouldBeMan() {
        assertThat(determineSex("Slawek")).isEqualTo("MAN");
    }

    @Test
    public void shouldBeManUppercase() {
        assertThat(determineSex("SLAWEK")).isEqualTo("MAN");
    }


    private String determineSex(String name) {
        String lastCharacter = name
                .substring(name.length() - 1)
                .toLowerCase();

        if (lastCharacter == "a") {
            return "GIRL";
        } else {
            return "MAN";
        }
    }
}
