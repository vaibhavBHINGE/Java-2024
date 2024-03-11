package Java;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max,a,b;
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		max=(a>b)?a:b;
		System.out.println(max+" is the grater numer");	
	}

}
