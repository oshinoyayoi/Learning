package test;

import java.util.Scanner;

public class day7 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input=new Scanner(System.in);
        int[] input1=new int[100];
        for (int i = 0; i < input1.length; i++) {
			input1[i]=(int) (Math.random()*1000);
			
		}
        int n=input.nextInt();
        try  {
			if (n>=100||n<0) {
				throw new Exception();
			}
		}
        catch (Exception e) {
			// TODO: handle exception
        	 System.out.println("Exception thrown  :" + e);
        	 System.out.println( "out of Bounds");
		}
         
	}
}
