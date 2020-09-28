/*
 * Sam Platt
 * CS 257
 * Written 14 Feb, 2020
 */
public class Bike extends WheeledVehicle {
	// INSTANCE VARIABLES
	protected boolean hasTrainingWheels;
	
	// CLASS VARIABLES
	public static final int NUM_WHEELS = 2;
	
	// CONSTRUCTORS
	public Bike(String name, int milesTraveled) {
		super(name, milesTraveled, NUM_WHEELS); // How do I fix this error?
		
		setName(name); // I'm not sure if this is necessary?
		this.milesTraveled = milesTraveled; // I'm not sure if this is necessary?
		hasTrainingWheels = false;
	}
	
	// METHODS
	public boolean getHasTrainingWheels() {
		return hasTrainingWheels;
	}
	
	public void setHasTrainingWheels(boolean wheels) {
		hasTrainingWheels = wheels;
	}
	
	@Override
	public String toString() {
		return "\nVehicle Type: Bike\tName: " + getName() + "\tMiles Traveled: " + getMilesTraveled() + "\tHas Training Wheels: " + getHasTrainingWheels();
	}
}
