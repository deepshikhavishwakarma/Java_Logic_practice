package com.hcl.basic;

import java.util.Scanner;
import java.util.*;
public class Main25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
           arr[i] = obj.nextInt(); 
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
         }
}