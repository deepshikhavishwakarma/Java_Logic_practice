package com.hcl.basic;

import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int res=1;
        while(userInput!=0){
            int rem = userInput%10;
            res*=rem;
            userInput/=10;
            
        }
        System.out.println(res);
    }
}
