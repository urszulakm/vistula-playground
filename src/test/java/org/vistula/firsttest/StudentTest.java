package org.vistula.firsttest;

import org.junit.Test;

public class StudentTest {

    @Test
    public void shouldCorrectlySetMyName() {
        Student ja = new Student();
        ja.setName("Slawek");
        assert ja.getName() == "Slawek";
    }

    @Test
    public void shouldCorrectlySetNumber() {
        Student ja = new Student();
        ja.setNumber(1);
        assert ja.getNumber() == 1;
    }

    @Test
    public void shouldCorrectlyDoubleNumber() {
        Student slawomir = new Student();
        slawomir.setNumber(20);
        assert slawomir.doubleNumber() == 40;
    }

    @Test
    public void shouldCorrectlyMultiplyNumber() {
        Student jadwiga = new Student();
        jadwiga.setNumber(10);
        assert jadwiga.multiplyNumber(10) == 100;
    }

}



