package Java;
import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value for a");
		int a=sc.nextInt();
		System.out.println("Enter value for b");
		int b=sc.nextInt();
		System.out.println("Enter value for c");
		int c=sc.nextInt();		
		
		if(a==60 && b==60 && c==60)		{
			System.out.println("Given triangle si equilateral");
		}
		else
		{
			System.out.println("Gien traingel is not Equivalent");
		}

	}

}
