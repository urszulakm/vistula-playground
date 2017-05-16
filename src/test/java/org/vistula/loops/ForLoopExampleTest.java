package org.vistula.loops;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.ArrayList;

public class ForLoopExampleTest {
    @Test
    public void basicForLoop() {
        // for (warunek początkowy; warunek kontynuacji; operacja na zakończenie pętli)
        for (int i = 9; i < 10; i++) {
            System.out.println(i);
        }
    }

}
