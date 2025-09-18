package com.hcl.basic;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        String res = (userInput%7==0)?"yes":"no";
        System.out.println(res);
        obj.close();
    }
}