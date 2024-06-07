/*  5 
   5 4 
  5 4 3 
 5 4 3 2 
5 4 3 2 1 
*/
package Triange;

import java.util.Iterator;
import java.util.Scanner;

public class t3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int sp=i;sp<=row-1;sp++) {
				System.out.print(" ");
			}
			int c = row;
			for(int j=1;j<=i;j++) {
				System.out.print(c--+" ");
			}
			System.out.println();
		}
	}
}
