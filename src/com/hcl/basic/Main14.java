package com.hcl.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main14 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '-') continue; // Handle negative numbers gracefully

            int digit = ch - '0';
            if ((digit & 1) == 1) {   // Check if odd
                if (result.length() > 0) result.append(' ');
                result.append(ch);
            }
        }

        System.out.println(result.length() == 0 ? "-1" : result.toString());
    }
}
