package test_inheritance;

public class Vehicle {
	
	int cost=0;
	int mileage=0;
	
	public Vehicle(int c, int m) {
		cost=c;
		mileage=m;
	}
	public void show_vehicle_details() {
		
		System.out.println("i am a vehicle");
		System.out.println("The cost of thevehicle is "+cost);
		System.out.println("The mileage of the vehicle is "+mileage);
	}
}
