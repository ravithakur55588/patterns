/*
 1
 121
 12321
 1234321
 123454321
 
 */


package Triange;

import java.util.Scanner;

public class t6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=2*i-1;j++) {
				if(j<=i) 
					System.out.print(j);
				else {
					int c=j;
					System.out.print(c-2);
				}
			}
			System.out.println();
		}
	}
}
