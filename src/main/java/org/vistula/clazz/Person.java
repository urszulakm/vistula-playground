package org.vistula.clazz;

public class Person {

    private String userName;

    public Person(String userName) {
        this.userName = userName;
    }

    public void printName() {
        System.out.println("Java has set my name to " + userName);
    }

}
