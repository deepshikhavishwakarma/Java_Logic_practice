package com.hcl.basic;

import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2= obj.nextInt();
        int userInput3 = obj.nextInt();
        System.out.println((userInput1*userInput2)%userInput3);
    }
}