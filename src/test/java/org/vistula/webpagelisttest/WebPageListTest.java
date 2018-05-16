package org.vistula.webpagelisttest;

import org.junit.Test;
import org.vistula.webpage.WebPage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageListTest {

    @Test
    public void shouldReturnTwoListElements() {
        WebPage onet = new WebPage("onet");
        WebPage wp = new WebPage("wp");

        List<WebPage> pages = new LinkedList<>();
        pages.add(onet);
        pages.add(wp);

        assertThat(pages.size()).isEqualTo(2);

        String titleFromList = pages.get(0).getTitle();
        assertThat(titleFromList).isEqualTo("onet");


    }

    @Test

    public void shouldRemoveFromList(){
       WebPage wp = new WebPage("WP");
       WebPage go2 = new WebPage("Go2");

       List<WebPage> pages = new ArrayList<>();

       pages.add(wp);
       pages.add(go2);
       pages.remove(0);

       assertThat(pages.size()).isEqualTo(1);

       String titleFromList = pages.get(0).getTitle();
       assertThat(titleFromList).isEqualTo("Go2");

    }



}

