package org.vistula.klient;

public class Klient {

    private String name;
    private int age;
    private int height;
    private int weight;
    private boolean isWoman;

    public Klient() {
    }

    public Klient(String name, int age, int height, int weight, boolean isWoman) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public boolean amIWoman() {
        if (isWoman == true) {
            System.out.println("Jestem kobieta");
            return true;
        } else {
            System.out.println("Jestem facetem");
            return false;
        }
    }

    public boolean isShort() {
        if (height < 150) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibileForPromo() {
        if (!isWoman
                && height > 170
                && weight < 80) {
            return true;
        } else {
            return false;
        }
    }

}
