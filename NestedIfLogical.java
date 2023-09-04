class NestedIfLogical {
	public static void main(String[] Logical) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("Program Started");
		if (a > b && a > c) {
			System.out.println(a + " is the greatest");
		} else if (b > c) {
			System.out.println(b + " is the greatest");
		} else {
			System.out.println(c + " is the greatest");
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * 30 is the greatest
 * Program Ended
 */