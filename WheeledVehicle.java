/*
 * Sam Platt
 * CS 257
 * Written 14 Feb, 2020
 */
public class WheeledVehicle extends Vehicle {
	// INSTANCE VARIABLES
	private int numWheels;
	protected boolean hasFlat;
	
	// CONSTRUCTORS
	public WheeledVehicle(String name, int milesTraveled, int numWheels) {
		super(name, milesTraveled);
		
		setName(name);
		this.numWheels = numWheels;
		hasFlat = false;
	}
	
	// METHODS
	public int getNumWheels() {
		return numWheels;
	}
	
	/*
	 * The goOneHour method should have no effect if the vehicle has a flat.
	 * If it does not have a flat, the parent class goOneHour method should be invoked.
	 */
	@Override
	protected void goOneHour() {
		if(hasFlat != true) {
			super.goOneHour();
		}
	}
	
	/*
	 * The fixFlat method should set the hasFlat instance variable to false;
	 */
	public void fixFlat() {
		hasFlat = false;
	}
	
	public String toString() {
		return "\nName: " + getName() + "\tMiles Traveled: " + getMilesTraveled() + "\tNumber of Wheels: " + getNumWheels() + "\tHas Flat: " + hasFlat;
	}
	
}
