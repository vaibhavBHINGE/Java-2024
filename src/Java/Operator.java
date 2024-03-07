package Java;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int i=sc.nextInt();
		if((i%4==0) || (i%400==0))
		{
			System.out.println("Given year is leap Year");
		}
		else {
			System.out.println("Given year is not leap Year");
		}

	}

}
