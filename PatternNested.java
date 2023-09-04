class PatternNested {
	public static void main(String[] args) {
		System.out.println("Program Started");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 ****
 ****
 ****
 ****
 * Program Ended
 * here i=no of rows
 * j=no of columns
 */
