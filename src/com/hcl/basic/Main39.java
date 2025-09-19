package com.hcl.basic;

import java.util.*;
public class Main39 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.nextLine();
        String[] strArr = userInput.split(" ");
        String findStr = obj.next();
        boolean flag=false;
        int count=0;
        for(String str:strArr){
            if(str.equals(findStr)){
               flag=true;
               count++;
              
            }
        }
        if(flag==true){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
       
    }
}