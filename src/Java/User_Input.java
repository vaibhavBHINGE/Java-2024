package Java;

import java.util.Scanner;

public class User_Input {
	public static void main(String []args) {
		 //Check whether person is eligible for vote or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age to cheak whaether your are eligible to vote");
		int person=sc.nextInt();
		if(person>=18)
		{
			System.out.println("Person is eligible for vote");
		}
		else
		{
			System.out.println("person is not eligible for vote");
		}
	}

}
