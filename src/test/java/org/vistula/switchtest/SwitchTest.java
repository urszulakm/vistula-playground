package org.vistula.switchtest;

import org.junit.Test;

/**
 * Created by user on 12.05.2018.
 */
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

}
