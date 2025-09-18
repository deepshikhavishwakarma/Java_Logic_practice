package com.hcl.basic;

import java.util.*;
public class Main11{
public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if( num <=1000){
            for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print(num);
        }
    }}