package test;

import java.util.Scanner;

public class leetcode1 {
	public static void main(String[] args) {

	    System.out.println("Enter a number:"); 
	    //输入数字1
	    Scanner input = new Scanner(System.in); 
	    int num1 = input.nextInt();  

	    System.out.println("Enter another number:");
	    //输入数字2
	    Scanner input2 = new Scanner(System.in); 
	     int num2 = input2.nextInt();

	    //求和
	     int num3 = num1+num2;
	     System.out.println("The sum is:"+num3);
	    }
	}

