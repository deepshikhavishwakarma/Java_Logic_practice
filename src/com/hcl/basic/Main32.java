package com.hcl.basic;

import java.util.Scanner;
public class Main32 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int n=1;
        int sum=0;
        while(n<=userInput){
          sum+=n; 
          n++;
        }
        System.out.println(sum);
    }
}
