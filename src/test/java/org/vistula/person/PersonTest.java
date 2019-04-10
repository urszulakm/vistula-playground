package org.vistula.person;

import org.junit.Test;

public class PersonTest {

    Person permanentDaria = new Person();

    @Test
    public void shouldCorrectlyReturnAge() {
        Person slawek = new Person();
        assert slawek.getAge() == 18;
    }

    @Test
    public void shouldCorrectlyReturnName() {
        Person slawek = new Person();
        assert slawek.getName().equals("Slawek");
    }

    @Test
    public void shouldCorrectlySetAge() {
        Person daria = new Person();
        assert daria.getAge() == 18;
        daria.setAge(19);
        assert daria.getAge() == 19;
    }

    @Test
    public void shouldCorrectlySetName() {
        Person zbyszek = new Person();
        zbyszek.setName("zbyszek");
        assert zbyszek.getName().equals("zbyszek");
    }

    @Test
    public void thirdMethod() {
    }


}
