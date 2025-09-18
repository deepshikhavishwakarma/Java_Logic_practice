package com.hcl.basic;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int count=1;
        for(int i=2;i<=userInput;i++){
           if(userInput%i==0){
               count++;
           } 
        }
        String res=(count!=2)?"no":"yes";
        System.out.println(res);
        obj.close();
    }
}