package org.vistula.person;

public class Person {
    private int age = 18;
    private String name = "Slawek";

    public Person () {
    }

    public int getAge() {
        return age;
    }
    public String getName () {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
