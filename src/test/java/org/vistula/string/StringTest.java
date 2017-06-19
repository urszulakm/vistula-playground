package org.vistula.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void shouldExtractNumber() {
        String text = "There are 4 animals in the room";
        int numberOfAnimals = extractNumberOfAnimals(text);
        //assert
    }

    private int extractNumberOfAnimals(String text) {
        return 0;
    }

}
