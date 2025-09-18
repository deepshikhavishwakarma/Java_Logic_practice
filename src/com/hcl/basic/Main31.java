package com.hcl.basic;

import java.util.Scanner;
public class Main31 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        int res= userInput1-userInput2;
        if(res%2==0){
           System.out.println("even"); 
        }else{
             System.out.println("odd");
        }
      
    }
}