package org.vistula.person;

public class Person {

    // Wartości domyślne dla każdego nowo tworzonego obiektu

    private int age = 18;
    boolean isAdult;
    private String name = "Slawek";

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void determineIfAdult() {
        if (age >= 18) {
            this.isAdult = true;
        } else {
            this.isAdult = false;
        }
    }

}
