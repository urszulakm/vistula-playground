package org.vistula.listener;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListenerTest {

    @Test
    public void listTests() {
        List<String> listenerSkills = new ArrayList<>();
        listenerSkills.add("Java");
        listenerSkills.add("Testing");

        Listener slawek;
        slawek = new Listener("Slawek", listenerSkills);

        assertThat(slawek.getSkills().size()).isEqualTo(2);
    }

    @Test
    public void forLopp() {
        List<String> listenerSkills = new ArrayList<>();
        listenerSkills.add("Java");
        listenerSkills.add("Testing");
        listenerSkills.add("Automation");
        listenerSkills.add("Jenkins");


        if (listenerSkills.size() > 3) {
            System.out.println("GOT A JOB! :)");
        }

        else if (listenerSkills.size() == 3) {
            System.out.println("HAVE A CHANCE");
        }

        else {
            System.out.println("NO JOB :(");
        }

    }

}
