package org.vistula.vistulamath;

public class VistulaMath {

    public static int add(int a, int b) {
        return a + b;
    }

    public static float divide(float a, float b){
        if (b == 0) {
            throw new ArithmeticException();
        }

        return a/b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }
}
