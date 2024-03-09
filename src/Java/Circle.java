package Java;

import java.util.Scanner;

public class Circle {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			float a;
			float pi=3.14f;
			float r;
			System.out.println("Enter a radius of cirlce:");
			r=sc.nextFloat();
			a=pi*(r*r);
			System.out.println("Area of circle is: "+a);

		}

	}
