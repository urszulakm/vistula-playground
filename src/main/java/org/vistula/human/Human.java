package org.vistula.human;

public class Human {

    private int age;
    private String firstName;
    private String lastName;

    public Human(){}

    public Human(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean canBuyAlcohol() {
        if (age >= 18) {
            return true;
        }

        else {
            return false;
        }
    }

}
