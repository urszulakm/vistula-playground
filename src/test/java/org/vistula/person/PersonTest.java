package org.vistula.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void shouldCheckName() {
        Person slawek = new Person("Slawek",
                "Radzyminski"
                , 29
                , 186);

        assertThat(slawek.getFirstName()).isEqualTo("Slawek");
        assertThat(slawek.getLastName()).isEqualTo("Radzyminski");
        assertThat(slawek.getAge()).isEqualTo(29);
        assertThat(slawek.getHeight()).isEqualTo(186);
    }

    @Test
    public void setterShouldWork() {
        Person angelina = new Person();
        angelina
                .setFirstName("Angelina")
                .setLastName("Jolie")
                .setAge(18)
                .setHeight(20);

        assertThat(angelina.getFirstName()).isEqualTo("Angelina");
        assertThat(angelina.getLastName()).isEqualTo("Jolie");

    }
}
