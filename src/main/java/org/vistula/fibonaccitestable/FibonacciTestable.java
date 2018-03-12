package org.vistula.fibonaccitestable;

public class FibonacciTestable {

    private int numberOne = 0;
    private int numberTwo = 1;

    public FibonacciTestable() {
    }

    public FibonacciTestable(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNthNumberFibonacciValue(int number) {
        int calculatedNextNumber;

        for(int i = 1; i < number; i++) {
            calculatedNextNumber = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = calculatedNextNumber;
        }

        return numberOne;
    }
}
