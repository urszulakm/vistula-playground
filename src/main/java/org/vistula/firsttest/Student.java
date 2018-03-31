package org.vistula.firsttest;

public class Student {

    int number;
    String name;

    public Student() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int doubleNumber() {
        return number * 2;
    }

    public int multiplyNumber(int multiplyer) {
        return number * multiplyer;
    }
}
