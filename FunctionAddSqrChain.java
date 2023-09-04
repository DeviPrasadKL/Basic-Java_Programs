//Combine Addition function and squaring function (chain function call)

class FunctionAddSqrChain {
	public static void add() {
		System.out.println("Addition Started");
		int a = 10;
		int b = 20;
		int sum = (a + b);
		System.out.println(sum);
		System.out.println("Addition Started");
		sqr();
	}

	public static void sqr() {
		System.out.println("Squaring Started");
		int n = 5;
		int sq = n * n;
		System.out.println(sq);
		System.out.println("Squaring Ended");
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		add();
		System.out.println("Main Ended");
	}
}

/*
 * Main Started
 * Addition Started
 * 30
 * Addition Started
 * Squaring Started
 * 25
 * Squaring Ended
 * Main Ended
 */