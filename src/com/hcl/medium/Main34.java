package com.hcl.medium;

import java.util.*;
public class Main34 {
   public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
         boolean isValid = false;
        if(n <100000){
            if(k <= n){
                 int arr[] = new int[n];
                 for(int i = 0; i < arr.length; i++){
                     arr[i] = obj.nextInt();
                 }
                 Arrays.sort(arr);
                 for(int i = 0; i < arr.length; i++){
                     if(arr[i] == k){
                         isValid = true;
                         break;
                     }
                 }
                 if(isValid){
                     System.out.println(arr[k -1]);
                 }else{
                 System.out.println("-1");
                 }
            }else{
                System.out.println("-1");
            }
        }

    }
}