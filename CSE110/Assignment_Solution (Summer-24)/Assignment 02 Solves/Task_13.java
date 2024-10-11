class one {
	public static void main(String args[]) {
		float h = 5;
		float m = 56;
		float s = 23;
		float Tns = (h * 3600 + m * 60 + s);
		float Mps = 1620 / Tns;
		float Kmps = Mps * 3.6f;
		float Mph = Kmps * 0.6215040398f;
		System.out.println("Your velocity in km/h is " + Kmps);
		System.out.println("Your velocity in miles/h is " + Mph);
	}
}
