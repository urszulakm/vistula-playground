package org.vistula.dayone;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Slawek {

    private String myName = "Slawek";

    @Test
    public void shouldPrintMyFirstNameAndLastName() {
        System.out.println(getMyFirstName() + " " + getMyLastName());
    }


    private String getMyLastName() {
        return "Radzyminski";
    }

    private String getMyFirstName() {
        return myName;
    }
}
