package vehicle;

public class Start {

	public static void main(String[] args) {
		
		Vehicle bike = new Vehicle("Bike", "petrol", 2019, 2, 2, 30, 1000.0);
		Vehicle boat = new Vehicle("Boat", "mechanical", 1999, 8, 8, 10, 2000.0);
		Vehicle carLux = new Car("Car", "electro", 2022, 5, 200, 6, 100000.0, "luxus");
		Vehicle carOld = new Car("Car", "diesel", 2000, 5, 150, 4, 3000.0, "quiteOld");
		Vehicle carFamily = new Car("Car", "petrol", 2010, 7, 150, 5, 7000.0, "family");
		Vehicle ferrari = new sportCar("Car", "petrol", 2020, 2, 300, 7, 150000.0, "sport", "red", "Ferrari", "Italy");
		Vehicle bugatti = new sportCar("Car", "petrol", 2017, 2, 250, 7, 140000.0, "sport", "black", "Bugatti", "Italy");
		Vehicle paganiZonda = new sportCar("Car", "petrol", 2015, 2, 300, 7, 130000.0, "sport", "blue", "Pagani Zonda", "Italy");
		
		System.out.println("These are the speeds of our cars: ");
		for (Vehicle veh : Vehicle.allVehicles) {
			if (veh instanceof Car) {
				Car temp = (Car) veh;
				temp.printCarsSpeed();
			}else {
				System.out.println(veh.type + " is not a car.");
			}		
		}
		
		for (Vehicle veh : Vehicle.allVehicles) {
			if (veh instanceof sportCar) {
				sportCar temp = (sportCar) veh;
				if (temp.brand.equals("Ferrari")) temp.changeSpeed(50);	
				if (temp.brand.equals("Bugatti")) temp.changeSpeed(70);	
				if (temp.brand.equals("Pagani Zonda")) temp.changeSpeed(-50);	
			} 
		}
		
		System.out.println();
		
		for (Vehicle veh : Vehicle.allVehicles) {
			if (veh instanceof Car) {
				Car temp = (Car) veh;
				if (temp.isSportCar()) continue;
				temp.changeGears(-1);	// if the car is not a sport car we decrease the number of gears;
			} 
		}
		
		System.out.println();
		for (Vehicle veh : Vehicle.allVehicles) {
			if (veh instanceof sportCar) {
				sportCar temp = (sportCar) veh;
				if (temp.brand.equals("Pagani Zonda")) temp.changeGears(1);	
				if (temp.brand.equals("Bugatti")) temp.changeGears(-1);	
			}
		}
		
		System.out.println();
		paganiZonda.steering("left");
		System.out.println();
		ferrari.steering("right");
	}
}
