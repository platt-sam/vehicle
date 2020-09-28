/*
 * Sam Platt
 * CS 257
 * Written 14 Feb, 2020
 */
import java.util.Random;

public class Car extends WheeledVehicle {
	// INSTANCE VARIABLES
	private int lastOilChange;
	
	// CLASS VARIABLES
	public static final int NUM_WHEELS = 4;
	public static final int OIL_CHANGE_BOUND = 3000;
	public static final int INCREMENT_MILES = 65;
	public static final int LOWER_BOUND = 1;
	public static final int UPPER_BOUND = 10;
	
	// CONSTRUCTORS
	public Car(String name, int milesTraveled) {
		super(name, milesTraveled, NUM_WHEELS);  // How do I fix this error?
		
		setName(name);
		this.milesTraveled = milesTraveled;
		lastOilChange = this.milesTraveled;
	}
	
	// METHODS
	@Override
	protected void goOneHour() {
		if(hasFlat != true) {
			milesTraveled += INCREMENT_MILES;
			
			Random randNum = new Random();
			
			int rnd = randNum.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
			
			if(rnd == 1) {
				hasFlat = true;
				System.out.println(getName() + ": flat tire at " + getMilesTraveled() + " miles");
			}
			
			if(getMilesTraveled() >= OIL_CHANGE_BOUND) {
				changeOil();
			}
		}
	}
	
	public void changeOil() {
		System.out.println(getName() + ": oil changed at " + getMilesTraveled() + " miles");
		lastOilChange = getMilesTraveled();
	}
	
	@Override
	public String toString() {
		return "\nVehicle Type: Car\tName: " + getName() + "\tMiles Traveled: " + getMilesTraveled() + "\tLast Oil Change: " + lastOilChange;
	}
}
