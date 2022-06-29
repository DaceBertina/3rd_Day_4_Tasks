package vehicle;

public class sportCar extends Car {

	String brand;
	String color;
	String origCountry;
	private final int maxSpeed = 380; // This suggestion came from George
	
	sportCar (String type, String engine, int year, int seats, int speed, int gears, double price, String carType, String color, String brand, String origCountry) {
		super(type, engine, year, seats, speed, gears, price, carType); 
		this.brand = brand;
		this.color = color;
		this.origCountry = origCountry;	
	}
	
	void changeSpeed(int newSpeed) {
		if (this.speed + newSpeed < 0 ) {
			System.out.println("Sorry, speed value can't be negative.");
			return;
		}
		if (this.speed + newSpeed > maxSpeed) {
			System.out.println("Sorry, there is a limit to the maximum speed. You are going to exceed it.");
			return;
		}
			
		this.speed += newSpeed;
		System.out.println("The speed of " + this.brand + " was changed to " + this.speed);
	}
	
	// Here we can call method changeGears especially for sport cars and add their brand name:
	@Override
	void changeGears(int gear) {
		this.gears += gear;
		System.out.println("The gears for " + this.brand + " were changed to: " + this.gears);
	}
	
	void steering(String direction) {
		System.out.print(this.brand);
		super.steering(direction);
	}
	
}
