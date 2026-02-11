package com.testcases;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a =");
		int a = sc.nextInt();
		System.out.print("b =");
		int b = sc.nextInt();
		if(a==b){
		    int c;
		    c = (a+b);
		    System.out.println(c);
		}
		else{
		    int d;
		    d = 2 *(a+b);
		    System.out.println(d);
		}
		sc.close();
		
	}
}
