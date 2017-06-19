package org.vistula.point;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    Point pointA = new Point(7, 7);
    Point pointB = new Point(3, 3);

    @Test
    public void shouldAddTwoPoints() {
        Point pointC = pointA.add(pointB);
        assertThat(pointC.getX()).isEqualTo(10);
    }

    @Test
    public void shouldSubstractTwoPoints() {
        Point pointC = pointA.substract(pointB);
        Point pointD = pointC.substract(pointB);
        assertThat(pointC.getX()).isEqualTo(4);
        assertThat(pointD.getY()).isEqualTo(1);
    }

}
