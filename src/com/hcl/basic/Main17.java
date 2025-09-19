package com.hcl.basic;

import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
  
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        for(int i=0;i<userInput.length();i++){
            if(i%2==0){
                System.out.print(userInput.charAt(i));
            }
        }
        System.out.print(" ");
        for(int i=0;i<userInput.length();i++){
            if(i%2!=0){
                System.out.print(userInput.charAt(i));
            }
        }
        obj.close();
    }
}