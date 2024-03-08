package Java;

import java.util.Scanner;

public class Nested_IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to cheak whether even or odd:");
		int i=sc.nextInt();
		if(i>0)
		{
			if(i%2==0)
			{
				System.out.println("Given Number is "+i+" and its an even number");
			}
				else 
				{
					System.out.println("Given Number is "+i+" and its an odd number");
				}			
		}
		else
		{
			System.out.println("Enter a positive number");
		}
	}

}
