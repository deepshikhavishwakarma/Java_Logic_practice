package com.hcl.basic;

import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        
        System.out.println((userInput%13==0)?"yes":"no");
    }
}