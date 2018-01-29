package Thursday;

public class House {
	int floors;
	String color;
	
	public House (int fl, String c) {
		this.floors=fl;
		this.color=c;
	}
	public void PrintData() {
		System.out.println("This house is "+this.color+" and has "+this.floors+" floors.");
	}
	

	public static void main(String[] args) {
		House h1 = new House(3, "white");
		House h2 = new House(1, "yellow");
		House h3 = new House(5, "blue");
		
		h1.PrintData();
		h2.PrintData();
		h3.PrintData();
		
		
	}

}
