package org.basicsOfJava;
import java.util.*;
public class Palindrome {
    public int palindromeNumber(int numberToRevCheck, int b) {
        int original = numberToRevCheck;
        while (numberToRevCheck != 0) {
            int digit = numberToRevCheck % 10;
            b = b * 10 + digit;
            numberToRevCheck = numberToRevCheck / 10;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberToRevCheck = sc.nextInt();
        Palindrome obj = new Palindrome();
        int reversed = obj.palindromeNumber(numberToRevCheck, 0);
        if (reversed == numberToRevCheck)
            System.out.println(numberToRevCheck + " is a palindrome number.");
        else
            System.out.println(numberToRevCheck + " is not a palindrome number.");


    }
}
