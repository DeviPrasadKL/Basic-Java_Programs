class NestedIf1 {
	public static void main(String[] threenumbers) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("Program Started");
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is the greatest number");
			} else {
				System.out.println(c + " is the greatest number");
			}
		} else if (b > c) {
			System.out.println(b + " is the greatest number");
		} else {
			System.out.println(c + " is the greatest number");
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * 30 is the greatest number
 * Program Ended
 */