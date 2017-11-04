package org.vistula.math;

public class Math {

    private int numberOne;
    private int numberTwo;

    public Math() {
    }

    public Math(int numberOne, int numberTwo) {
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

    public int multiply() {
        return getNumberOne() * getNumberTwo();
    }

    public int multiply(int firstNumber, int secondNumber ) {
        return firstNumber * secondNumber;
    }
}
