package com.hcl.medium;

import java.util.Scanner;
public class Main33 {
   static int solve(int n,int arr[])
    {
        int maxm=Integer.MAX_VALUE,secondMaxm=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<maxm)
            {
                secondMaxm=maxm;
                maxm=arr[i];
            }
            else if(arr[i]<secondMaxm && arr[i]!=maxm)
            {
                secondMaxm=arr[i];
            }
        }
        return secondMaxm==Integer.MAX_VALUE?-1:secondMaxm;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int ans=solve(n,arr);
        System.out.println(ans);

    }
}