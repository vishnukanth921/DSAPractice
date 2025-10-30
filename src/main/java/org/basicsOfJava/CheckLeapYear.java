package org.basicsOfJava;
import java.util.*;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not: ");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 400 ==0){
            System.out.println("leap year");
        }else if (year % 100 !=0) {
            System.out.println("leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
