package Triange;

import java.util.Scanner;

public class t4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row = ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int sp=i;sp<row-1;sp++) {
				System.out.print(" ");
			}
			int c=row;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(c--);
//				if(c==0)
//					break;
			}
			System.out.println();
		}
	}
}
