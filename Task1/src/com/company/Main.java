package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to our opening ceremony! What is your name?");
        String name = sc.next ();
        System.out.println("Hello, " + name + "! Nice to meet you! Let me invite you in.");
    }
}