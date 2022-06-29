package vehicle;


public class Car extends Vehicle {
	
	String carType;
	
	Car() {}
	Car (String type, String engine, int year, int seats, int speed, int gears, double price, String carType) {
		super(type, engine, year, seats, speed, gears, price); 
		this.carType = carType;	
	}
	
	void printCarsSpeed() {
		System.out.println(this.speed);
	}
	
	boolean isSportCar() {
		return this.carType.equals("sport");
	}
	
	void changeGears(int gear) {
		this.gears += gear;
		System.out.println("The gears for " + this.carType + " car were changed to: " + this.gears);
	}
	
}
