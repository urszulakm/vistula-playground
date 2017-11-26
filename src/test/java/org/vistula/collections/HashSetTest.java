package org.vistula.collections;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HashSetTest {

    private WebPage onet = new WebPage("onet");
    private WebPage interia = new WebPage("interia");
    private WebPage wp = new WebPage("wp");
    private WebPage gazeta = new WebPage("gazeta");

    @Test
    public void shouldBeEqual() {
        HashSet<WebPage> webPages = new HashSet<>();

        webPages.add(onet);
        webPages.add(interia);
        webPages.add(wp);
        webPages.add(gazeta);

        HashSet<WebPage> webPagesEN = new HashSet<>();
        webPagesEN.add(wp);
        webPagesEN.add(onet);
        webPagesEN.add(interia);
        webPagesEN.add(gazeta);
        webPagesEN.add(onet);

        assertThat(webPages).isEqualTo(webPagesEN);

        assertThat(webPagesEN.size()).isEqualTo(4);
    }

}
