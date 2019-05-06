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
    @Test
    public void contructorWithParam() {
        Person marcin = new Person(35,"Marcin");
        assert marcin.getAge() == 35;
        assert marcin.getName().equals("Marcin");
    }

    @Test
    public void shouldDetermineIfAdult() {
        Person slawek = new Person();
        slawek.determineIfAdult();
        assert slawek.isAdult() == true;
    }
    @Test
    public void shouldNotAdult() {
        Person marcin = new Person();
        marcin.setAge(16);
        marcin.determineIfAdult();
        assert marcin.isAdult() == false;
    }

}
