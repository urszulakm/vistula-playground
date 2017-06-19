package org.vistula.person;

public class Person {

    String firstName;
    String lastName;
    int age;
    int height;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }
    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setHeight(int height) {
        this.height = height;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

}
