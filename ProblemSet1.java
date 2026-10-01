package edu.monmouth.problemSet1;

public class ProblemSet1 {

	public static void main(String[] args) {
		
		//Creating the first object using constructor with parameters
		CampusVehicle vehicle1 = new CampusVehicle("1FA6P8CF0H5102948", "Library", true);  

		//Printing the attributes of the object using accessor methods
		System.out.println("Vehicle 1:");
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Vehicle is available: " + vehicle1.isAvailable());
		System.out.println();
		
		// Creating 4 new objects using the default constructor
		CampusVehicle vehicle2 = new CampusVehicle();
		CampusVehicle vehicle3 = new CampusVehicle();
		CampusVehicle vehicle4 = new CampusVehicle();
		CampusVehicle vehicle5 = new CampusVehicle();
		
		// Printing the default attributes of the 4 new objects
		System.out.println("Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println();

		System.out.println("Vehicle 3:");
		System.out.println("ID: " + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Vehicle is available: " + vehicle3.isAvailable());
		System.out.println();

		System.out.println("Vehicle 4:");
		System.out.println("ID: " + vehicle4.getId());
		System.out.println("Location: " + vehicle4.getLocation());
		System.out.println("Vehicle is available: " + vehicle4.isAvailable());
		System.out.println();

		System.out.println("Vehicle 5:");
		System.out.println("ID: " + vehicle5.getId());
		System.out.println("Location: " + vehicle5.getLocation());
		System.out.println("Vehicle is available: " + vehicle5.isAvailable());
		System.out.println();
		
		//Using the mutator methods to set the attributes for the 4 objects
		vehicle2.setId("1HGCM8263A0045172");
		vehicle2.setLocation("University Bluffs");
		vehicle2.setAvailable(false);
		
		vehicle3.setId("5YFBURHE7FP382641");
		vehicle3.setLocation("Parking Lot");
		vehicle3.setAvailable(true);
		
		vehicle4.setId("3FA6P0H74HR215903");
		vehicle4.setLocation("Spruce Hall");
		vehicle4.setAvailable(false);

		vehicle5.setId("1N4AL3AP8JC274615");
		vehicle5.setLocation("Laurel Hall");
		vehicle5.setAvailable(false);
		
		//Printing the updated attributes of the 4 objects using the accessor methods
		System.out.println("Updated Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println();

		System.out.println("Updated Vehicle 3:");
		System.out.println("ID: " + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Vehicle is available: " + vehicle3.isAvailable());
		System.out.println();

		System.out.println("Updated Vehicle 4:");
		System.out.println("ID: " + vehicle4.getId());
		System.out.println("Location: " + vehicle4.getLocation());
		System.out.println("Vehicle is available: " + vehicle4.isAvailable());
		System.out.println();

		System.out.println("Updated Vehicle 5:");
		System.out.println("ID: " + vehicle5.getId());
		System.out.println("Location: " + vehicle5.getLocation());
		System.out.println("Vehicle is available: " + vehicle5.isAvailable());
		System.out.println();

		
		
		
		
		
		
	}

}
