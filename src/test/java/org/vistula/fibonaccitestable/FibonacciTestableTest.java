package org.vistula.fibonaccitestable;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTestableTest {

    @Test
    public void shouldCorrectlyCalculateFibonacci() {
        int tenthFibonacciCorrectValue = 34;

        FibonacciTestable fibonacciTestable = new FibonacciTestable();
        int valueCalculatedByOurProgram = fibonacciTestable.getNthNumberFibonacciValue(10);

        assertThat(valueCalculatedByOurProgram).isEqualTo(tenthFibonacciCorrectValue);
    }

}
