package org.vistula.footballer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class FootballerTest {
    @Test
    public  void canHeader () {
        Footballer lewandowski = new Footballer();
        List<String> skilsy = new ArrayList<>();
        skilsy.add("Headers");
        lewandowski.setSkills(skilsy);
        assertThat(lewandowski.canHeaders()).isTrue();
    }
    @Test
    public void thingsHeCannotDo(){

        Footballer rasiak = new Footballer();
        List<String> skills = new ArrayList<>();
        skills.add("dribble");
        rasiak.setSkills(skills);
        assertThat(rasiak.canHeaders()).isFalse();

    }
}
