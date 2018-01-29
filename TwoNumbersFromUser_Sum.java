package Thursday;

import java.util.Scanner;

public class TwoNumbersFromUser_Sum {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter number from 1st user: ");
		int u1 = user.nextInt();
		
		System.out.print("Enter number from 2nd user: ");
		int u2 = user.nextInt();
		
		int result = u1+u2;
		System.out.println("The sum of those numbers is: " + result);
		
		
		// TODO Auto-generated method stub

	}

}
