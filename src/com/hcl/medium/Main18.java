package com.hcl.medium;

import java.util.Scanner;
import java.util.*;
public class Main18 {
    static int findGCD(int n,int m)
    {
        if(n==0)return -1;
        if(m==0)return -1;
        int val=Math.min(n,m);
        while(val>0)
        {
            if(n%val==0 && m%val==0)
            return val;
            val--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int val=findGCD(Math.abs(n),Math.abs(m));
        System.out.println(val);
    }
}