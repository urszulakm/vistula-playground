package org.vistula.mathutils;

import org.junit.Test;

/**
 * Created by user on 21.04.2018.
 */
public class DivisionTest {

    @Test
    public void shouldCorrectDiv (){
    Division division1 = new Division();
    division1.setNumberA(10.6f);
    division1.setNumberB(4f);
    assert division1.divisionNumberANumberB()== 2.5f;

    }
}
