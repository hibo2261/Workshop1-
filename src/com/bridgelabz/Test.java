package com.bridgelabz;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        Taking input from user
         */

        System.out.println("palindrome test ");
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem, rev = 0;
        int t = n;
        /*
          Reversing a number
         */
        while (t > 0) {
            rem = t % 10;
            rev = rev * 10 + rem;
            t = t / 10;
        }
          /*
          Checking if reverse no. is same as given no.
          (Palindrome)
           */
        if (n == rev)
            System.out.println("no. is palindrome");

         else
            System.out.println("no. is not palindrome");

    }
}















