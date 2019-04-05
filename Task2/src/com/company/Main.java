package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amount of people in the room:");
	int room = sc.nextInt ();
        System.out.println("Enter the amount of people in the queue:");
        int q = sc.nextInt();
String answer = (100-room)>q?"Can fit":"Can't fit";
        System.out.println(answer);

    }
}
