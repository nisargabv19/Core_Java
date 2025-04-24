package com.passfail;
import java.util.Scanner;
public class passorfail {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int m=sc.nextInt();
		if(m>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
