
public class Assgn11Test {

	private static final int[] Room = null;

	public static void main(String[] args) {

		Room single = new Room(8, 10, 9, "carpet", 2, 3);
		System.out.println(single);
		roomCalc(single);	
		
		Garage garTest = new Garage(2, 12, 10, true, 1, 0);
		System.out.println(garTest);
		roomCalc(garTest);			
		
		House bungalow = new House(2, 2, 10);
		System.out.println(bungalow);
		roomCalc(bungalow);					
}

	public static void roomCalc( Building eola) { 		
		eola.calcFloorSpace(); 
	}
}
