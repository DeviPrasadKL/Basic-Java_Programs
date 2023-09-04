//Write a function to find addition of two numbers(with parameter & with return type)

class FunctionAddWithparaAndReturn {
	public static int add(int a, int b) {
		System.out.println("Addition Started");
		int c = (a + b);
		System.out.println("Addition Ended");
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println(add(10, 20));
		System.out.println(add(100, 420));
		System.out.println("Main Ended");
	}
}

/*
 * Main Started
 * Addition Started
 * Addition Ended
 * 30
 * Addition Started
 * Addition Ended
 * 520
 * Main Ended
 */