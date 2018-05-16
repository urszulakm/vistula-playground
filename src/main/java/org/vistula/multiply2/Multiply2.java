package org.vistula.multiply2;


public class Multiply2 {
    int a;
    int b;

    public Multiply2() {

    }

    public Multiply2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int multiply(int numberA, int numberB){
        return numberA * numberB;
    }
}
