/*
 
 1       1
 12     21
 123   321
 1234 4321
 123454321            
 1234 4321
 123   321
 12     21 
 1       1
 
 */
package Triange;

import java.util.Scanner;

public class d2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
				for(int sp=i;sp<=2*i-1;sp++)
				{
					System.out.print(" ");
				}
				
				for(int m=1;m<=i;m--) {
					System.out.print(m);
				}
			}
			System.out.println();
			
		}
			
			
	}
}
