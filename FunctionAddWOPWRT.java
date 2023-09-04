//Write a function to find addition of two numbers(without parameter & with return type)

class FunctionAddWOPWRT {
	public static int add() {
		System.out.println("Addition Started");
		int a = 10;
		int b = 20;
		int c = (a + b);
		System.out.println("Addition Ended");
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		int res = add();
		System.out.println(res); // or System.out.println(add());
		System.out.println("Main Ended");
	}
}

/*
 * Main Started
 * Addition Started
 * Addition Ended
 * 30
 * Main Ended
 */