package com.forr;
import java.util.Scanner;
public class firstnevenandoddnumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
			int n=sc.nextInt();
			System.out.println("first"+n+"even numbers are");
			for(int i=2;i<=n*2;i=i+2) {
				System.out.println(i + " ");
			}
			System.out.println("first"+n+"odd numbers are");
			for(int i=1;i<=n*2-1;i=i+2) {
				System.out.println(i + " ");
			}
}
}