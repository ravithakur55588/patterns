/*
    1
   1 2
  1   3
 1     4
1       5
 1     4
  1   3
   1 2
    1
 */
package Triange;

import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int sp=i;sp<=row;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
				    System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--) {
			for(int sp=i;sp<=row;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
				    System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
