package org.vistula.shoe;

public class Shoe {
    /*****POLA*****/
    String name;
    int size;
    boolean isOnPromotion;

    public Shoe() {
    }

    public Shoe(String name, int size, boolean isOnPromotion) {
        this.name = name;
        this.size = size;
        this.isOnPromotion = isOnPromotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOnPromotion() {
        return isOnPromotion;
    }

    public void setOnPromotion(boolean onPromotion) {
        isOnPromotion = onPromotion;
    }



}
