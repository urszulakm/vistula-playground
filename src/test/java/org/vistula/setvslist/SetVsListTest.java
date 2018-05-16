package org.vistula.setvslist;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetVsListTest {

    @Test
    public void shouldDemonstrateTheDifference() {
        WebPage onet1 = new WebPage("onet");

        List<WebPage> pagesList = getWebPages(onet1);
        assertThat(pagesList).size().isEqualTo(2);

        Set<WebPage> pagesSet = getWebPagesAsSet(onet1);
        assertThat(pagesSet).size().isEqualTo(1);
    }

    private Set<WebPage> getWebPagesAsSet(WebPage onet1) {
        Set<WebPage> pagesSet = new HashSet<>();
        pagesSet.add(onet1);
        pagesSet.add(onet1);
        return pagesSet;
    }

    private List<WebPage> getWebPages(WebPage onet1) {
        List<WebPage> pagesList = new ArrayList<>();
        pagesList.add(onet1);
        pagesList.add(onet1);
        return pagesList;
    }

}
