package Java;

import java.util.Scanner;

public class Switch {
	public static void main(String[]args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number inbetween 1 to 7 to dispaly days in weak");
			int day=sc.nextInt();
			switch(day) {
			case 1:System.out.println("your selected day is monday");
			break;
			case 2:System.out.println("your selected day is Tuseday");
			break;
			case 3:System.out.println("your selected day is Wednesday");
			break;
			case 4:System.out.println("your selected day is Thurseday");
			break;
			case 5:System.out.println("your selected day is friday");
			break;
			case 6:System.out.println("your selected day issaturday");
			break;
			case 7:System.out.println("your selected day issunday");
			break;
			default:System.out.println("your selected day is Enter Number not in-between 1 to 7");
			}
		}
	}