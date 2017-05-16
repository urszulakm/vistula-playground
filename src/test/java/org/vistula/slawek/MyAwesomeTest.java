package org.vistula.slawek;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyAwesomeTest {
    private int five = 5;
    private int six = 6;

    private int maximum = Integer.MAX_VALUE;
    private int minimum = Integer.MIN_VALUE;

    @Test
    public void awesomeTest() {
        assertThat(minimum).isEqualTo(-2147483648);
        assertThat(add(five, six)).isEqualTo(11);
        assertThat(divide(six, five));
    }

    private int add(int a, int b) {
        return a+b;
    }

    private int divide(int a, int b) {
        return a/b;
    }

}
