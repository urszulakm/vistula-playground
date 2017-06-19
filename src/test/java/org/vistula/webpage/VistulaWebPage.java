package org.vistula.webpage;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VistulaWebPage {

    String slawek = "Slawek";
    int liczba = 7;
    int liczbaInaczej = new Integer(7);

    private WebPage onet = new WebPage("ONET");

    @Test
    public void shouldHaveProperTitle() {
        assertThat(onet.getTitle()).isEqualTo("ONET");

        int fsd = new Integer(6);

    }

}
