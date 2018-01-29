package Thursday;

public class Cars {
	
	String model;
	float length;
	String color;
	
	
	public Cars (String m, float l, String c) {
		this.length=l;
		this.color=c;
		this.model=m;
	}
	public void PrintData () {
		System.out.println("Model: " + this.model);
		System.out.println("Length: " + this.length + " Color: " + this.color);
		
	}
	
	public static void main(String[] args) {
		Cars subaru = new Cars("Subaru", 5, "silver");
		Cars jeep = new Cars ("Jeep", 6, "green");
		Cars mazda = new Cars ("Mazda", 6, "white");
		
		subaru.PrintData();
		jeep.PrintData();
		mazda.PrintData();
		

	}	

}
