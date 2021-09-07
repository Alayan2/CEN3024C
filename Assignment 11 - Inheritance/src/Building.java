
abstract public class Building extends Object {

	private int floors, windows;
	
	public Building(int floors, int windows) {
		setFloors(floors);
		setWindows(windows);
	}
	
	abstract public void calcFloorSpace();
		
	
	public int getFloors() { 
		return floors;
	}
	
	public void setFloors(int floors) { 
		this.floors = floors;
	}
	
	public int getWindows() { 
		return windows;
	}
	
	public void setWindows(int windows) { 
		this.windows = windows;
	}
	
	public String toString() { 
		String result;
		result = "\nThe building has " + floors + " floors and " + windows + " windows.";
		return result;
	}
}
