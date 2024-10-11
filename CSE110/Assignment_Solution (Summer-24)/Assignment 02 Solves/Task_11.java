class one {
	public static void main(String args[]) {
		double a = 4.5;
		double b = 9.5;
		double c = (Math.sqrt((a * a) + (b * b)));
		double SinA = a / c;
		double CosA = b / c;
		double SinB = b / c;
		double CosB = a / c;
		System.out.println("sin(A)= " + SinA);
		System.out.println("cos(A)= " + CosA);
		System.out.println("sin(B)= " + SinB);
		System.out.println("cos(B)= " + CosB);
	}
}

