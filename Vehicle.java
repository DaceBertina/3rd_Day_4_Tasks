package vehicle;

import java.util.ArrayList;

public class Vehicle {
	String type;
	String engine;
	int year;
	int seats;
	int speed; // km/h
	int gears;
	double price;
	
	static ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
	
	Vehicle() {}
	Vehicle(String type, String engine, int year, int seats, int speed, int gears, double price) {
		this.type = type;
		this.engine = engine;
		this.year = year;
		this.seats = seats;
		this.speed = speed;
		this.gears = gears;
		this.price = price;
		allVehicles.add(this);
	}
	
	void steering(String direction) {
		System.out.print(" just turned " + direction + ".");
	}
}
