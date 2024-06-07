package Triange;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b[]=new byte[2];
		int i = sc.nextInt();
		double j = sc.nextDouble();
		sc.nextLine();
		String st = sc.nextLine();
		
		System.out.println("String : "+st);
		System.out.println("Double : "+j);
		System.out.println("int : "+i);
	}
}