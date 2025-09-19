package com.hcl.basic;

import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        int userInput3 = obj.nextInt();
        
        System.out.println(2*((userInput1*userInput2)+(userInput2*userInput3)+(userInput3*userInput1))+" "+(userInput1*userInput2*userInput3));
    }
}