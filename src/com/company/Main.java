package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the telephone number: ");

        String rawInput = scanner.nextLine();

        TelephoneNumber telephoneNumber = new TelephoneNumber();

        System.out.println(telephoneNumber.processInput(rawInput));
    }
}
