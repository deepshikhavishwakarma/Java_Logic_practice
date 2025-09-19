package com.hcl.basic;

import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        
        int absRes = Math.abs(userInput1-userInput2);
        System.out.println(absRes);
        obj.close();
    }
}