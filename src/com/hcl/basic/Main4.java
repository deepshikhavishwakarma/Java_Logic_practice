package com.hcl.basic;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int pow=1;
        while(pow<=userInput){
            pow*=2;
        }
        System.out.println(pow);
    }
}