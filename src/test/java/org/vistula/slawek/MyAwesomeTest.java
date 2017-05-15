package org.vistula.slawek;

import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyAwesomeTest {

    private int maximum = Integer.MAX_VALUE;
    private int minumum = Integer.MIN_VALUE;

    @Test
    public void awesomeTest() {
        String blabla = "There should be 4 cows";
        assertThat(getNumberOfCows(blabla)).isEqualTo(4);
    }

    private int getNumberOfCows(String blabla) {
       return Integer.parseInt(blabla.substring(16,17));
    }

}
