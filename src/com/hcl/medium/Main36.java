package com.hcl.medium;

import java.util.Scanner;
public class Main36 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput1 = obj.next();
        String userInput2 = obj.next();
        if(userInput1.equals(userInput2)){
            System.out.println("yes");
        }else{
           System.out.println("no");
        }
       // System.out.println("The Input Provided is: " + userInput);
    }
}
