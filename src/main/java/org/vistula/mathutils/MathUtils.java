package org.vistula.mathutils;

public class MathUtils {

    int numberA;
    int numberB;

    public MathUtils() {
    }

    public MathUtils(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }


    // Nasza działalność twórcza podlegająco wyższym kosztom
    // uzyskania przychodu 80%

    public int addVariablesInClass() {
        return numberA + numberB;
    }

    public int subtractVariablesInClass(){

        return numberA - numberB;
    }

    public int multiplyVariablesInClass(){
        return numberA * numberB;
    }

    public float divideVariablesInClass() {
        return (float)numberA / (float)numberB;
    }

    public int multiplyTwoParameters(int a, int b){
        return a*b;
    }
}
