package com.hcl.basic;

import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       long n = obj.nextLong();
        long m = obj.nextLong();
        long product = n * m;
        long square = (long) Math.sqrt(product);
        if(square * square == product){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
