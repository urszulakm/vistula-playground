package org.vistula.point;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point otherPoint) {
        int newXCrd = this.x + otherPoint.x;
        int newYCrd = this.y + otherPoint.y;
        return new Point(newXCrd, newYCrd);
    }

    public Point substract(Point otherPoint) {
        int newXCrd = this.x - otherPoint.x;
        int newYCrd = this.y - otherPoint.y;
        return new Point(newXCrd, newYCrd);
    }

}
