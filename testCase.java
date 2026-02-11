package com.testcases;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("a =");
	int a = sc.nextInt();
	System.out.print("b =");
	int b = sc.nextInt();
	System.out.print("c =");
	int c = sc.nextInt();
 
    float disc = (b*b) - (4*a*c);
    
    if (disc == 0) {
    	float x = (-b-disc)/(2*a);
    	System.out.println("The value of both roots will be same: " + x);
    	    }
    else if(disc > 0) {
    	float x1 = (-b-disc)/(2*a);
    	System.out.println("The first value of the root x1 :" + x1);
    	float x2 = (-b+disc)/(2*a);
    	System.out.println("The Second value of the root x2 :" + x2);
            }
    else {
    	System.out.println("The equation has no real root");
    }    
	sc.close();	
	}
}
