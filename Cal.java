package com.company;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numeric value:");
        double s=sc.nextDouble();
        System.out.println("Enter a numeric value:");
        double i=sc.nextDouble();
        double add=s+i;
        double mult=s*i;
        double div=s/i;
        double sub=s-i;

        System.out.println("The answer is "+add);
        System.out.println("The answer is "+mult);
        System.out.println("The answer is "+div);
        System.out.println("The answer is "+sub);




    }
}
