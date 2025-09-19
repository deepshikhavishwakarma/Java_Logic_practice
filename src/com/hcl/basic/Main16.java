package com.hcl.basic;

import java.util.*;
import java.math.BigDecimal;

import java.math.RoundingMode;
public class Main16 {
    public static void main(String[] args){
   Scanner obj = new Scanner(System.in);
        Double length = obj.nextDouble();
        Double breadh = obj.nextDouble();
        // DecimalFormat df = new DecimalFormat("0.00000");
        BigDecimal area = new BigDecimal(length * breadh);
        area = area.setScale(5,RoundingMode.DOWN);
        System.out.println(area.toPlainString());
        obj.close();
}}