package org.vistula.webpage;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageTest {
    @Test
    public void shouldBeEqualIfTitlesAreTheSame() {
        WebPage p1 = new WebPage("someTitle");
        WebPage p2 = new WebPage("someTitle");

        assertThat(p1).isEqualToComparingFieldByField(p2);
    }

    @Test
    public void shouldNotBeEqualIfTitlesAreNotTheSame() {
        WebPage p1 = new WebPage("someTitle");
        WebPage p2 = new WebPage("someOtherTitle");

        boolean result = p1.equals(p2);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldHaveProperTitle() {
        //given
        String expectedTitle = "some title";
        WebPage page = new WebPage(expectedTitle);

        //when
        String actualTitle = page.getTitle();

        //then
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Test
    public void shouldContainTwoWebpages() {
        WebPage p1 = new WebPage("someTitle");
        WebPage p2 = new WebPage("someOtherTitle");

        ArrayList<WebPage> webPages = new ArrayList<>();
        webPages.add(p1);
        webPages.add(p2);
        assertThat(webPages).size().isEqualTo(2);

        for (WebPage item : webPages) {
            System.out.println(item.getTitle());
        }

    }
}