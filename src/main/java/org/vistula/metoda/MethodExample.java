package org.vistula.metoda;

import java.util.Scanner;

public class MethodExample {

    public static void main(String[] args) {
        Scanner myConsole = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter two numbers");

        int numberOne = myConsole.nextInt();  // Read user input
        int numberTwo = myConsole.nextInt(); // Read user input

        MathClass myMayClass = new MathClass(numberOne, numberTwo);
        int sumOfMyNumbers = myMayClass.getSum();

        System.out.println("Suma dwóch liczb to: " + sumOfMyNumbers);
    }
}
