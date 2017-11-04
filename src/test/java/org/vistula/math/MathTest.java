package org.vistula.math;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MathTest {

    @Test
    public void shouldCorrectlyMultiply() {
        Math multiplication = new Math(5,6);
        assertThat(multiplication.multiply()).isEqualTo(30);
    }

    @Test
    public void shouldCorrectlyMultiply2() {
        Math multi = new Math();
        multi.setNumberOne(3);
        multi.setNumberTwo(4);
        assert multi.multiply() == 12;
    }

    @Test
    public void multiplayMethodTest() {
        Math multipla = new Math();
        assert multipla.multiply(2,5) == 10;
    }

}
