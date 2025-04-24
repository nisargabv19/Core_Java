package com.addinput;
import java.util.Scanner;

public class addusinginput {
    public static void main(String args []) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the value of a");
    	int a =sc.nextInt();
    	System.out.println("enter the value of b");
    	int b=sc.nextInt();
    	int c= a+b;
    	System.out.println("sum of"+ a+ "and" +b +"="+c);
    }
}
