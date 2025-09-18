package com.hcl.basic;

import java.util.Scanner;
public class Main28 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int count=0;
        while(userInput!=0){
          userInput/=10;
          count++;
        }
        System.out.println(count);
    }
}