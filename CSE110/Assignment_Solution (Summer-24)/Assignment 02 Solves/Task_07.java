class one {
		public static void main(String args[]) {
			int min = 3456789;
			int convert = min / (60 * 24);
			int years = convert / 365;
			int days = convert % 365;
			System.out.print(min + " minutes is approximately " + years + " years and " + days + " days");
		}
	}
	
	
