class Circle implements Shape{
	
	private int radius;
	static final double pi = 3.14;
	
	public static void main(String[] args) {
		Circle c = new Circle(4);
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		int rSquared = radius * radius;
		return rSquared * pi;
	}
	
	public void display() {
		return;
	}
}