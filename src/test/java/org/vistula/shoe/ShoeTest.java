package org.vistula.shoe;

import org.junit.Test;

public class ShoeTest {


    @Test
    public void shouldCorrectlySetName() {
        Shoe myShoesObject = new Shoe();
        myShoesObject.setName("Nike");
        assert myShoesObject.getName().equals("Nike");
    }

    @Test
    public void constructorWithParametersTest() {
        Shoe mySundayShoes = new Shoe("Adidas", 41, false);
        assert mySundayShoes.getName().equals("Adidas");
        assert mySundayShoes.getSize() == 41;
        assert mySundayShoes.isOnPromotion() == false;
    }

}
