package com.sumprod;
import java.util.Scanner;
public class sumandprod {
	public static void main(String args[]) {
		int i,sum=0,prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
			prod=prod*i;
			
		}
		System.out.println("sum of first"+n+"natural numbers are ="+sum);
	    System.out.println("prod of first"+n+"natural numbers are"+prod);

}
}
