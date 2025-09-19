package com.hcl.basic;
import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int sum = (C * (2 * A + (C - 1) * B))/2;
        System.out.println(sum);
    }
}