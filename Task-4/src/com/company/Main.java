package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, revname = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        name = in.nextLine();

        int length = name.length();

        for (int i = length - 1; i >= 0; i--)
            revname = revname + name.charAt(i);

        if (name.equals(revname))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");

    }
}