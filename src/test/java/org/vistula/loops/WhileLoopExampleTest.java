package org.vistula.loops;

import org.junit.Test;

public class WhileLoopExampleTest {
    @Test
    public void basicWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void basicWhileMinusLoop() {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
