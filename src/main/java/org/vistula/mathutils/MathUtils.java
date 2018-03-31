package org.vistula.mathutils;

public class MathUtils {

    int numberA;
    int numberB;

    public MathUtils() {
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int addNumbersInClass() {
        return numberA+numberB;
    }

    public int addNumbersAsParameters(int a, int b) {
        return a+b;
    }

}
