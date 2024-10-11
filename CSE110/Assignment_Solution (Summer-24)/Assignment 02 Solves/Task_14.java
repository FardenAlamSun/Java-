class one {
	public static void main(String args[]) {
		int a = 8;
		int b = 3;
		int X = a / 2;
		double Y = Math.sqrt(X * X + b * b);
		double Area = (3 * Math.sqrt(3) * Y * Y) / 2;
		double circumference = 6 * Y;
		
		System.out.println("Area of the Hexagon = " + Area);
		System.out.print("Circumference of the Hexagon = " + circumference);
	}
}
