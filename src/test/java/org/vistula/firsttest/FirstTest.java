package org.vistula.firsttest;

import org.junit.Test;

public class FirstTest {

    @Test
    public void myFirstTest() {
        assert 5 != getNumber();
    }


    @Test
    public void shouldReturnCorrectName() {
        assert "Sławek" == getMyName();
    }


    public String getMyName() {
        return "Sławek";
    }


    public int getNumber() {
        return 6;
    }

}
