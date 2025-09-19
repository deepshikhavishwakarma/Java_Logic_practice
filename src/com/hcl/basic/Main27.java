package com.hcl.basic;

import java.util.Scanner;
public class Main27 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        int[] arr = new int[userInput1];
        for(int i=0;i<userInput1;i++){
            arr[i]=obj.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(userInput2==arr[i]){count++;}
        }
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }

    }
}