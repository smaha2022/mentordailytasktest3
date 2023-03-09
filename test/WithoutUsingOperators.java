package com.test;

import java.util.Scanner;

public class WithoutUsingOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n ");
		int n=sc.nextInt();
		// Multiply n* 15

		
        int result1 = (n << 4) - n;
        System.out.println( result1);
        
         // Multiply n integer with 7.5
        
        int result2 =(n<<3)-(n>>1);
        System.out.println( result2);
        
        // value of 15 × n/16 
        
        int div = ((n<<4)-n)>>4;
        System.out.println( div);
    }


	}


