//W A P to compare two numbers

class IfElseIf1 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		int a = 20;
		int b = 10;
		if (a < b) {
			System.out.println(a + " is less than " + b);
		} else if (a == b) {
			System.out.println(a + " is equal " + b);
		} else {
			System.out.println(a + " is greater than " + b);
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * 20 is greater than 10
 * Program Ended
 */