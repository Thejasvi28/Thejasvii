package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s1=getInput("Enter a numeric value:");
        String s2=getInput("Enter a numeric value:");
        String s3=getInput("Choose an operation (+ - * /):");
        double result=0;
        try{
            switch(s3){
                case "+":
                    result=add(s1,s2);
                    break;
                case "-":
                    result=sub(s1,s2);
                    break;
                case "*":
                    result=mul(s1,s2);
                    break;
                case "/":
                    result=div(s1,s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
            System.out.println("The answer is "+result);
        }catch(Exception e){
            System.out.println("Number formatting exception "+e.getMessage());
        }
    }
    private static double add(String s1,String s2){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        return d1+d2;
    }
    private static double sub(String s1,String s2){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        return d1-d2;
    }
    private static double mul(String s1,String s2){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        return d1*d2;
    }
    private static double div(String s1,String s2){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        return d1/d2;
    }

    private static String getInput(String val){
        System.out.println(val);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }

}
