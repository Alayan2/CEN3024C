
public class Room extends Building {

	private int length, width, closets;
	private String flrCover;
	
	public Room(int length, int width, int closets, String flrCover, int floors, int windows) {
		super(floors, windows);
		setLength(length);
		setWidth(width);
		setClosets(closets);
		setFlrCover(flrCover);
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}	

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}	

	public void calcFloorSpace() {
		int floorSpace = length * width;
		System.out.println("Floor space: " + floorSpace);
	}

	
	public int getClosets() {
		return closets;
	}
	
	public void setClosets(int closets) {
		this.closets = closets;
	}	

	public String getflrCover() {
		return flrCover;
	}
	
	public void setFlrCover(String flrCover) {
		this.flrCover = flrCover;
	}
 
	public String toString() {
		String result;
		result = "\nRooms\nFloor Cover: " + flrCover + "\n" + "Number of closets: " 
		+ closets + super.toString();
		return result;
	}
	
}
