package org.vistula.human;

import org.junit.Test;

public class HumanTest {

    @Test
    public void myFirstTest() {
        Human slawek = new Human(19, "Slawek");
        assert slawek.getAge() == 19;
    }

    @Test
    public void testEmptyConstructor() {
        Human jessica = new Human();
        jessica.setAge(19);
        assert jessica.getAge() == 19;
    }

    @Test
    public void verifyName() {
        Human slawek = new Human(19, "Slawek");
        assert slawek.getName() == "Slawek";
    }

    @Test
    public void verifyName2() {
        Human jessica = new Human();
        jessica.setName("Jessica");
        assert jessica.getName() == "Jessica";
    }

}
