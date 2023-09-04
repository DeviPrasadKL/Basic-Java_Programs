//Write a Function to find square of a number

class functions1 {
	public static void sqr() {
		System.out.println("Squaring Started");
		int n = 5;
		int sq = n * n;
		System.out.println(sq);
		System.out.println("Squaring Ended");
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		sqr();
		System.out.println("main Ended");
	}
}

/*
 * Main Started
 * Squaring Started
 * 25
 * Squaring Ended
 * main Ended
 */