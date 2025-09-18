package com.hcl.basic;

import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        char[] ch = userInput.toCharArray();
        int n = userInput.length();
        if(n%2==0){
            ch[(n-1)/2]='*';
            ch[((n-2)/2)+1]='*';
         }else{
             ch[n/2]='*';
         }
          String str="";
         for(char ch2 : ch){
             str+=ch2;
         }
         
       System.out.println(str);
    }
}
