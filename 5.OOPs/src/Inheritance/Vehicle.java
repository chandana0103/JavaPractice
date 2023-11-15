package Inheritance;
//Accessing parent class variable in child class

class Vehicle {
	  protected String brand = "Ford"; // Vehicle attribute
	 String vehicleType;
	}

	class Car extends Vehicle {
	  private String modelName = "Mustang"; 
	  String car;					// Car attribute
	  
	  public void honk() {                    // Vehicle method
		    System.out.println("Tuut, tuut!");
		  }
	  public void details() {
		  vehicleType="bus";
		  car="honda";
		  System.out.println(vehicleType+","+car);
	  }
	  
	  public static void main(String[] args) {
	    Car myCar = new Car();			 // Create a myCar object
	 
	    myCar.honk();			    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.details();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	}
