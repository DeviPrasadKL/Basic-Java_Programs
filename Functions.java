//Write a function to find addition of two numbers(without parameter & without return type)

class Functions {
	public static void add() {
		System.out.println("Addition Started");
		int a = 10;
		int b = 20;
		int sum = (a + b);
		System.out.println(sum);
		System.out.println("Addition Started");
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		add();
		System.out.println("Main Started");
	}
}

/*
 * Main Started
 * Addition Started
 * 30
 * Addition Started
 * Main Started
 */