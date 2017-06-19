package org.vistula.dayone;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstAndLastName {

    private String myFirstName = "Slawek";
    private String myLastName = "Radzyminski";

    @Test
    public void shouldVerifyMyFirstName() {
        assertThat(getMyFirstName()).isEqualTo(myFirstName);
    }

    @Test
    public void shouldVerifyMyLastName() {

    }

    @Test
    public void shouldPrintHelloSlawek() {
        System.out.println("Hello " + getMyFirstName());
    }

    private String getMyFirstName() {
        return myFirstName;
    }

    private String getMyLastName() {
        return myLastName;
    }
}
