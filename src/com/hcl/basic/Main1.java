package com.hcl.basic;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        String res=(num1+num2)%2==0? "even" : "odd";
        System.out.println(res);
        obj.close();
      }
}