package Thursday;

public class Cat {
	String color;
	String gender;
	String behaviour;
	
    Cat(){
		//color,gender.Behaviour:eat.
	color="brown" ;
	gender="male" ;
	behaviour="playful" ;
			
	}
    
	public static void main(String[] args) {
		Cat c = new Cat();
		
		Cat balinese = new Cat(); //created an object of class Cat
		Cat korat = new Cat(); 	  //created an object of class Cat

		
		System.out.println("Cats color is - " + c.color);
		System.out.println("Cats gender is - " + c.gender);
		System.out.println("Cats behaviour is - " + c.behaviour);

	}

}
