
public class Car {
	//public void start() {
		//System.out.println("Car started");
	
	//public void stop() {
		//System.out.println("Car Stoped");
	

	String status= "Stoped";
	public void start() {
		if(status=="Stoped") {
	  System.out.println("Car starting");
	  status= "Started";
	  
	  
	  }
		else {
			System.out.println("Car is already started");
		}
		
		}
	public void stop() {
		System.out.println("Car stopped now");
	}
	public static void main (String[]args) {
		Car bmw= new Car();
	    bmw.start();
		bmw.start();
		bmw.stop();
		bmw.stop();
		
		
	}
	}
	
