package com.passfail;
import java.util.Scanner;

public class grades {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int m=sc.nextInt();
		if(m>=90) {
			System.out.println("A");
		}
		else if(m>=75&&m<=89) {
			System.out.println("B");
		}
		else if(m>=60&&m<=74) {
			System.out.println("c");
		}
		else if(m>=35&&m<=59) {
			System.out.println("D");
		}
		else {
			System.out.println("fail");
		}
	}

}
