package com.forr;
import java.util.Scanner;
public class naturalnumbers {
  public static void main(String args[]) {
	  System.out.println("enter the value of n");
	  Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	  System.out.println("first"+n+"natural numbers are");
	  for(int i=1;i<=n;i++) {
		  System.out.println(i+" ");
	  }
	  
  }
}
