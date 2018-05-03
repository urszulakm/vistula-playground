package org.vistula.mathutils;

public class Division {

    float numberA;
    float numberB;


    public Division() {
    }

    public Division(float numberA, float numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public float getNumberA() {
        return numberA;
    }

    public void setNumberA(float numberA) {
        this.numberA = numberA;
    }

    public float getNumberB() {
        return numberB;
    }

    public void setNumberB(float numberB) {
        this.numberB = numberB;
    }

    public float divisionNumberANumberB () {
        return numberA/numberB;
    }



}
