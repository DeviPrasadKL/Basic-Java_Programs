//Write a program to check weather a person is elijible for marriage in matrimony.

class Marriage {
	public static void main(String[] args)

	{
		char gender = 'M';
		int age = 18;
		System.out.println("Program Started");
		if (gender == 'M') {
			if (age >= 21) {
				System.out.println("You are eligible for Marriage");
			} else {
				System.out.println("Hey kid, wait for some more years");
			}
		} else if (gender == 'F') {
			if (age >= 18) {
				System.out.println("You are eligible for Marriage");
			} else {
				System.out.println("Hey kid, wait for some more years");
			}
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * Hey kid, wait for some more years
 * Program Ended
 */