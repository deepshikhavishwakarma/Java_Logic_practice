package com.hcl.basic;

import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        while(userInput!=0){
            int rem = userInput%10;
            if(rem!=0){
            System.out.print(rem);}
            userInput/=10;
        }
       // System.out.println("The Input Provided is: " + userInput);
    }
}