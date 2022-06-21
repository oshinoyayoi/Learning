package test;

import java.util.Scanner;
//编写一个方法，使用下面的方法头求出一个整数数组中的最小元素：
//
//public static double min(double[] array)
public class day4 {
	
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	//创建数组
	    double[] list1 = new double[10];
	//输入十个数字

	    for (int i = 0; i < list1.length; i++) {
	        System.out.println("Enter the No." + (i + 1) + " value :");
	        list1[i] = input.nextInt();
	    }
	    //定义min
	    double min = list1[0];

	    for (int i = 0; i < list1.length; i++) {
	        if (i > min) {
	            min = i;
	        }
	    }
	    System.out.println(min);
	}

}
