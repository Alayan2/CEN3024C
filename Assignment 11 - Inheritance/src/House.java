
public class House extends Building {
	
	private int bathrooms;
//	private ArrayList rooms = new ArrayList();

	public House(int bathrooms, int floors, int windows) {
		super(floors, windows);
		setBathroom(bathrooms);
	}
	
	public void calcFloorSpace() {
			System.out.println("Note: Could not calculate floor space/rooms.");
	}
	
	public void setBathroom(int bathrooms) {
		this.bathrooms = bathrooms;
	}
		
	public String toString() {
		String result;
		result = "\nHouse\nThe house has " + bathrooms + " bathrooms.\n";
		return result;
	}
}
