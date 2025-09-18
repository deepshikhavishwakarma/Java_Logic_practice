package com.hcl.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main40 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        boolean seenFirstZero = false;
        boolean foundSecondZero = false;
        StringBuilder segment = new StringBuilder();

        int read = 0;
        outer:
        while (read < N) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens() && read < N) {
                int x = Integer.parseInt(st.nextToken());
                read++;

                if (!seenFirstZero) {
                    if (x == 0) seenFirstZero = true;
                } else { // we are between zeros
                    if (x == 0) {
                        foundSecondZero = true;
                        break outer; // done
                    } else {
                        if (segment.length() > 0) segment.append(' ');
                        segment.append(x);
                    }
                }
            }
        }

        if (seenFirstZero && foundSecondZero && segment.length() > 0) {
            System.out.println(segment.toString());
        } else {
            System.out.println("-1");
        }
    }
}

