package org.vistula.client;

import java.util.List;

public class Client {

    String name;
    int age;
    List<String> basket;
    boolean isActive = true;
    int orderCount = 0;

    public Client(){

    }

    public Client(String name, int age, List<String> basket) {
        this.name = name;
        this.age = age;
        this.basket = basket;
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

    public int getOrderCount() {
        return orderCount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getBasket() {
        return basket;
    }

    public void setBasket(List<String> basket) {
        this.basket = basket;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void sendOrder() {
        if (basket.size() <= 5) {
            orderCount = orderCount + 1;
            System.out.println("Order sent");
        }

        else {
            System.out.println("Too many products");
        }
    }


}
