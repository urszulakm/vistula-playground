package org.vistula.mathutils;

import org.junit.Test;

public class MathUtilsTest {

    // Dodawanie

    @Test
    public void shouldCorrectlyAddNumbersSetInClass() {
        MathUtils mathUtils = new MathUtils();
        mathUtils.setNumberA(5);
        mathUtils.setNumberB(6);
        assert mathUtils.addNumbersInClass() == 11;
    }

    @Test
    public void shouldCorrectlyAddNumbersAsParameters() {
        MathUtils mathUtils = new MathUtils();
        assert mathUtils.addNumbersAsParameters(4,5) == 9;
    }

    // Odejmowanie

    @Test
    public void shouldCorrectlySubtractNumbersSetInClass() {


    }

    @Test
    public void shouldCorrectlySubtractNumbersAsParameters() {

    }

    // Mnozenie

    @Test
    public void shouldCorrectlyMultiplyNumbersSetInClass() {


    }

    @Test
    public void shouldCorrectlyMultiplyNumbersAsParameters() {

    }

    // Dzielenie

    @Test
    public void shouldCorrectlyDivideNumbersSetInClass() {


    }

    @Test
    public void shouldCorrectlyDivideNumbersAsParameters() {

    }

}
