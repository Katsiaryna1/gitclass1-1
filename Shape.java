package Thursday;

import java.util.Scanner;

public class Shape {
	int len;
	int br;
	double area;
	
	public Shape (int len, int br) {
		this.len=len;
		this.br=br;
	}
	
	public void calculation() {
		area=len*br;
		
		System.out.print("The square has - " + len +" lenght and " + br + " breadth.");
		System.out.println(" And the area of the Shape is " + area + " inches."); 
	}
	
	public static void main(String[] args) {
		Scanner sq = new Scanner(System.in);
		
		System.out.println("Input number for the lenght:  ");
		int len=sq.nextInt();
		
		System.out.println("Input number for the breadth:  ");
		int br=sq.nextInt();
		
		sq.close();
		
		//System.out.println("The area of the Shape is: "+ area);
		
		Shape sq1 = new Shape(len,br);
		//Square sq2 = new Square(5,5);
		
		sq1.calculation();
		//sq2.calculation();
		
	}

}

