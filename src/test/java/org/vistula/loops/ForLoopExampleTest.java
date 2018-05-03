package org.vistula.loops;

import org.junit.Test;

public class ForLoopExampleTest {
    @Test
    public void basicForLoop() {
        // for (warunek początkowy; warunek kontynuacji; operacja na zakończenie pętli)
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void basicForMinusLoop() {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

}
