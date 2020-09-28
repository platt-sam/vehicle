/*
 * Sam Platt
 * CS 257
 * Written 14 Feb, 2020
 */

public class Boat extends Vehicle {
	
	// INSTANCE VARIABLES
	
	// CLASS VARIABLES
	public static final int INIT_MILES_TRAVELED = 0;
	public static final int INCREMENT_MILES = 6;
	public static final int INCREMENT_MILES_DRIFT = 2;
	
	// CONSTRUCTORS
	public Boat(String name) {
		super(name, INIT_MILES_TRAVELED);
		
		setName(name);
	}
	
	// METHODS
	public void drift() {
		milesTraveled += INCREMENT_MILES_DRIFT;
	}
	
	@Override
	protected void goOneHour() {
		milesTraveled += INCREMENT_MILES;
	}
	
	@Override
	public String toString() {
		return "\nVehicle Type: Boat\tName: " + getName() + "\tMiles Traveled: " + getMilesTraveled();
	}
}
