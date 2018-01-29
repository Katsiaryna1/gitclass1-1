package Thursday;

import java.util.Scanner;

public class Switch_SONI {

	public static void main(String[] args) {
		System.out.println("Enter the Operation - like + our -");
		//create a scanner
		Scanner opr = new Scanner(System.in);
		
		//
		char var = opr.next().charAt(0);
		int result=0;
		switch(var) {
		
			case '+':
				result = 5+6;
				break;
			
			case '-':
				result = 5-1;
				break;
		default:
			System.out.println("The Operator is wrong");
		
		}
		System.out.println("This is the result - " + result);
	}

}
