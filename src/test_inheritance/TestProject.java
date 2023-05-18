package test_inheritance;

import java.util.Scanner;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter cost of vehicle");
		int vehicle_cost=scan.nextInt();
		
		
		System.out.println("enter mileage of vehicle");
		int vehicle_mileage=scan.nextInt();
		
		System.out.println("enter color of car");
		String car_color=scan.next();
		
		System.out.println("enter number of tyres");
		int car_tyres=scan.nextInt();
		
		Car obj = new Car(vehicle_cost,vehicle_mileage,car_color,car_tyres);
		obj.show_car_details();
		
		obj.show_vehicle_details();
	}

}
