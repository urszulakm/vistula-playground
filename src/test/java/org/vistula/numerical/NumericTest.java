package org.vistula.numerical;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumericTest {
    private int five = 5;
    private int six = 6;
    private int four = 4;
    private int two = 2;

    private String dfsd =  "gdf";

    private int maximum = Integer.MAX_VALUE;
    private int minimum = Integer.MIN_VALUE;

    @Test
    public void awesomeTest() {
        assertThat(minimum).isEqualTo(-2147483648);
        assertThat(add(five, six)).isEqualTo(11);
        assertThat(divide(six, five)).isEqualTo(1);
    }

    @Test
    public void shouldCorrectlySubstract() {
        assertThat(substract(two, four)).isEqualTo(-2);
    }

    @Test
    public void shouldCorrectlyMultiply() {
        assertThat(multiply(two, four)).isEqualTo(8);
    }

    private int add(int a, int b, int c) {
        return a+b+c;
    }

    private int add(int a, int b) {
        return a+b;
    }

    private int divide(int a, int b) {
        return a/b;
    }

    private int substract(int a, int b) {
        return a-b;
    }

    private int multiply(int a, int b) {
        return a*b;
    }

    private int maxValueAdd() {
        return maximum + 111;
    }

}
