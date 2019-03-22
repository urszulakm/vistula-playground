package org.vistula.metoda;

public class MathClass {
    private final int numberTwo;
    private final int numberOne;

    public MathClass(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getSum() {
        return numberOne + numberTwo;
    }

}
