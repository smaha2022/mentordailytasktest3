package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal {

	 public static List<List<Integer>> generate(int numRows) 
	 {
	        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
	        if (numRows == 0)
	        {
	            return triangle;
	        }
	        List<Integer> firstRow = new ArrayList<Integer>();//first list
	        firstRow.add(1);
	        triangle.add(firstRow);
	        for (int i = 1; i < numRows; i++) 
	        {
	            List<Integer> row = new ArrayList<Integer>();
	            row.add(1);
	            for (int j = 1; j < i; j++)//2
	            {
	                List<Integer> pascal= triangle.get(i-1);//1
	                int sum = pascal.get(j-1) + pascal.get(j);
	                row.add(sum);
	            }
	            row.add(1);
	            triangle.add(row);
	        }
	        return triangle;
	    }
	    
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the no of rows: ");
	        int numRows = sc.nextInt();
	        List<List<Integer>> triangle = generate(numRows);
	       
	        for (List<Integer> row : triangle)
	        {
	            System.out.println(row);
	        }
	    }
	}