package com.hcl.basic;

import java.util.Scanner;
public class Main35 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.nextLine();
        char[] ch = userInput.toCharArray();
        
        System.out.println(ch.length);
    }
}
