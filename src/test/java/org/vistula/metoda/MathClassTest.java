package org.vistula.metoda;

import org.junit.Test;

public class MathClassTest {

    @Test
    public void shouldCorrectlyAdd() {
        MathClass mathClass = new MathClass(6, 7);
        assert mathClass.getSum() == 13;
    }

}
