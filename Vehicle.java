/*
 * Sam Platt
 * CS 257
 * Written 14 Feb, 2020
 */
public class Vehicle {
	
	// INSTANCE VARIABLES
	private String name;
	protected int milesTraveled;
	
	// CLASS VARIABLES
	public static final int INCREMENT_MILES = 7;
	
	// CONSTRUCTORS
	public Vehicle(String name, int milesTraveled) {
		
		setName(name);
		this.milesTraveled = milesTraveled;
	}
	
	// METHODS
	public int getMilesTraveled() {
		return milesTraveled;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * The goOneHour method should increase the milesTraveled by 7 miles.
	 */
	protected void goOneHour() {
		milesTraveled += INCREMENT_MILES;
	}
	
	/*
	 * The go method should invoke goOneHour the number of times specified in the argument numHours.
	 */
	public void go(int numHours) {
		for(int i = 0; i < numHours; i++) {
			goOneHour();
		}
	}
	
	/*
	 * The returned value from all toString methods should include all instance variables with appropriate labels.
	 * You must explicitly invoke parent class toString methods as applicable to construct parent class portions of the string...
	 * (this may require that you implement parent class toString methods with this in mind).
	 */
	public String toString() {
		return "\nName: " + getName() + "\tMiles Traveled: " + getMilesTraveled();
	}
	
}
