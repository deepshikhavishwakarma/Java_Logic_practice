package com.hcl.medium;

import java.util.*;
public class Main41 {
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        boolean found = false;
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "yes" : "no");

    }
}