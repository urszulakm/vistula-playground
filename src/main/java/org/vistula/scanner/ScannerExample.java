package org.vistula.scanner;

import java.util.Scanner;

class ScannerExample {

    public static void main(String[] args) {
        Scanner myConsole = new Scanner(System.in);  // Create a ScannerExample object
        System.out.println("Enter username");

        String userName = myConsole.nextLine();// Read user input

        while(userName.equals(""))
        {
            System.out.println("Enter username again. It's empty");
            userName = myConsole.nextLine();
        }
        System.out.println("Username is: " + userName);  // Output user input
    }

}
