package org.vistula.lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ToNieMaZnaczenia {

    @Test
    public void shouldHaveSevenElements() {
        List<String> daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        assertThat(daysOfWeek).size().isEqualTo(7);
        assertThat(daysOfWeek.get(6)).isEqualTo("Sunday");
    }

}
