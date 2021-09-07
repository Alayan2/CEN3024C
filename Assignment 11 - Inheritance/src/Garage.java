
public class Garage extends Building{

	private int cars, gLength, gWidth;
	private boolean cement;
	
	public Garage(int cars, int gLength, int gWidth, boolean cement, int floors, int rooms) {
		super(floors, rooms);
		setCars(cars);
		setGLength(gLength);
		setCement(cement);
		setGWidth(gWidth);
	}
	
	public void calcFloorSpace() {
		int floorSpace = gLength * gWidth;
		System.out.println("Floor space: " + floorSpace);
	}

	public int getCars() {
		return cars;
	}
	
	public void setCars(int cars) {
		this.cars = cars;
	}	

	public int getGLength() {
		return gLength;
	}
	
	public void setGLength(int gLength) {
		this.gLength = gLength;
	}	

	public int getGWidth() {
		return gWidth;
	}
	
	public void setGWidth(int gWidth) {
		this.gWidth = gWidth;
	}	
	
	public boolean getCement() {
		return cement;
	}
	
	public void setCement(boolean cement) {
		this.cement = cement;
	}	
	
	public String toString() {
		String result;
		if(cement = true) {
			result = "\nGarage\nThis garage holds " + cars + " car(s).\n" 
					+ "The garage has a cement floor.";
		} else 
			result = "Garage\nThis garage holds " + cars + " car(s).\n" 
					+ "The garage has a gravel floor.";
		return result;
	}

}
