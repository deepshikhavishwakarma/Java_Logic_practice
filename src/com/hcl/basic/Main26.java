package com.hcl.basic;

import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        int[] arr = new int[userInput1];
        for(int i=0;i<userInput1;i++){
            arr[i]=obj.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(userInput2==arr[i]){
               // System.out.println("yes");
                flag=true;
                break;
            }
            
        }
        System.out.println((flag)?"yes":"no");
    }
}
