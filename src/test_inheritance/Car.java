package test_inheritance;

public class Car extends Vehicle {
	String color= "blue";
	int tyres= 4;
	public Car(int c, int m, String col, int ty) {
		super(c, m);
		// TODO Auto-generated constructor 
		color=col;
		tyres=ty;
	}

	
	public void show_car_details() {
		System.out.println("i am a car");
		System.out.println("The color of car is "+color);
		System.out.println("The number of tyres are "+tyres);
	}

}
