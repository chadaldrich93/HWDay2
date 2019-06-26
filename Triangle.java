class Triangle implements Shape{
	
	private int side;
	
	public static void main(String[] args) {
		
	}
	
	public Triangle(int side) {
		this.side = side;
	}
	
	public double calculateArea(){
		int aSquared = side * side;
		//1.73 is the square root of 3, to 2 decimal places
		return ( (1.73 * aSquared)/ 4 );
	}
	
	public void display() {
	   return;	
	}
}