package org.vistula.collections;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ArrayListTest {

    private WebPage onet = new WebPage("onet");
    private WebPage interia = new WebPage("interia");
    private WebPage wp = new WebPage("wp");
    private WebPage gazeta = new WebPage("gazeta");

    @Test
    public void shouldPrintTitles() {
        ArrayList<WebPage> webPages = new ArrayList<>();

        webPages.add(onet);
        webPages.add(interia);
        webPages.add(wp);
        webPages.add(gazeta);

    }

    @Test
    public void equality() {
        ArrayList<WebPage> webPages = new ArrayList<>();
        webPages.add(onet);
        webPages.add(interia);
        webPages.add(gazeta);
        webPages.add(wp);

        ArrayList<WebPage> webPagesEN = new ArrayList<>();
        webPagesEN.add(onet);
        webPagesEN.add(interia);
        webPagesEN.add(wp);
        webPagesEN.add(gazeta);

        assertThat(webPages).isNotEqualTo(webPagesEN);
    }

    @Test
    public void shouldBeCorrectTitle() {
        ArrayList<WebPage> webPages = new ArrayList<>();
        webPages.add(onet);
        webPages.add(interia);

        assertThat(webPages.get(0).getTitle()).isEqualTo("onet");
    }
}
