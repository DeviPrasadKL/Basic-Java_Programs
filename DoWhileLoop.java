//W a p to print even numbers from 1 to 10

class DoWhileLoop {
	public static void main(String[] args) {
		int n = 2;
		System.out.println("Program Started");
		do {
			System.out.println(n);
			n = n + 2;
		} while (n <= 10);
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * 2
 * 4
 * 6
 * 8
 * 10
 * Program Ended
 */