class Rectangle implements Shape{
	static private int length;
	static private int width;
	
	public static void main(String[] args) {
	    length = 5;
	    width = 6;
	    Rectangle r = new Rectangle(length, width);
	    System.out.println(r.calculateArea());
	    r.display();
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length * width;
	}
	
	public void display() {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == length-1 ||
					j == 0 || j == width-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}