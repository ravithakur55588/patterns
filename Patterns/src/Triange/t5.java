/*
    1
   1 2
  1   3
 1     4
1 2 3 4 5
 */
package Triange;

import java.util.Scanner;

public class t5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Rows = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int sp=i;sp<row;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			    if(j==1 || i==j || i==row)
			    	System.out.print(j+" ");
			    else
			    	System.out.print("  ");   //double space
			}
			System.out.println();
		}
	}
}
