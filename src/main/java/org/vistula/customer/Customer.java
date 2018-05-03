package org.vistula.customer;

import java.util.Objects;

public class Customer {

    private String name;
    private int         age;
    private boolean isWoman;

    public Customer() {
    }

    public Customer(String name, int age, boolean isWoman) {
        this.name = name;
        this.age = age;
        this.isWoman = isWoman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public boolean isClientAdult() {
        if(age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isSlawek() {
        return name.equals("Slawek");
    }


}
