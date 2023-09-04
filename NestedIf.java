class NestedIf {
	public static void main(String[] args) {
		int a = 80;
		int b = 20;
		System.out.println("Program Started");
		if (a <= b) {
			if (a < b) {
				System.out.println(a + " is less than " + b);
			} else {
				System.out.println(a + " is equal to " + b);
			}
		} else {
			System.out.println(a + " is greater than " + b);
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * 80 is greater than 20
 * Program Ended
 */