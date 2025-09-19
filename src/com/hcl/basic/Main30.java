package com.hcl.basic;

import java.util.Scanner;
public class Main30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = ((n / 10) + 1) * 10;
        System.out.println(result);
    }
}