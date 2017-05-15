package org.vistula.point;

import org.junit.Test;

public class PointTest {

    @Test
    public void shouldCreateNewPoint() {
        Point a = new Point(7, 7);
        Point b = new Point(3, 3);

        a.add(b);
    }
}
