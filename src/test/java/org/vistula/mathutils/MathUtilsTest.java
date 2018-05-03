package org.vistula.mathutils;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void shouldCorrectlyAdd() {
        MathUtils addition = new MathUtils();
        addition.setNumberA(7);
        addition.setNumberB(8);
        assert addition.addVariablesInClass() == 15;
    }

    @Test
    public void shouldCorrectlyAddUsingDifferentConstructor() {
        MathUtils addition = new MathUtils(7, 8);
        assert addition.addVariablesInClass() == 15;
    }

    @Test
    public void shouldCorrectlyAddSecondTest() {
        MathUtils addition = new MathUtils();
        addition.setNumberA(-8);
        addition.setNumberB(8);
        assert addition.addVariablesInClass() == 0;
    }

    @Test

    public void shouldCorrectlySubtract() {
        MathUtils subtraction = new MathUtils();
        subtraction.setNumberA(10);
        subtraction.setNumberB(5);

        assert subtraction.subtractVariablesInClass() == 5;
    }

    @Test
    public void shouldCorrectlySubtractInDifferentWay() {
        MathUtils subtraction = new MathUtils(10, 5);
        assert subtraction.subtractVariablesInClass() == 5;
    }

    @Test
    public void shouldCorrectlyMultiply() {
        MathUtils multiply = new MathUtils();
        multiply.setNumberA(5);
        multiply.setNumberB(2);
        assert multiply.multiplyVariablesInClass() == 10;
    }

    @Test
    public void shouldCorrectlyMultiply2() {
        MathUtils multiply = new MathUtils(5, 9);
        assert multiply.multiplyVariablesInClass() == 45;

    }

    @Test
    public void xxx() {
        MathUtils divide = new MathUtils(10,4);
        assert divide.divideVariablesInClass() == 2.5;
    }

    @Test
    public void shouldMultiplyTwoNumbers(){
       MathUtils multiply = new MathUtils();
       assert multiply.multiplyTwoParameters(2,3) == 6;
       assert multiply.multiplyTwoParameters(-1,3) == -3;
       assert multiply.multiplyTwoParameters(-2, -1) == 2;
    }
}
