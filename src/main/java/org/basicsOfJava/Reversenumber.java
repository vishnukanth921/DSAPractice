package org.basicsOfJava;
import java.sql.SQLOutput;
import java.util.*;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberToBeReversed = sc.nextInt();
        int ranNum = 0;
        while(numberToBeReversed>0){
            ranNum = ranNum * 10 + numberToBeReversed % 10;
            numberToBeReversed = numberToBeReversed/10;


        }
        System.out.println("Reversed number: " + ranNum);


    }
}
