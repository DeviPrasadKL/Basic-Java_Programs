class NestedForLoop {
	public static void main(String[] args) {
		System.out.println("Program Started");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println("i value is " + i + " value is " + j);
			}
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * i value is 1 value is 1
 * i value is 1 value is 2
 * i value is 1 value is 3
 * i value is 1 value is 4
 * i value is 2 value is 1
 * i value is 2 value is 2
 * i value is 2 value is 3
 * i value is 2 value is 4
 * i value is 3 value is 1
 * i value is 3 value is 2
 * i value is 3 value is 3
 * i value is 3 value is 4
 * Program Ended
 */