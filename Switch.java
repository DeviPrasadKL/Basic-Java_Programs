//Write a program to display student result

class Switch {
	public static void main(String[] args) {
		char grade = 'B';
		System.out.println("Program Started");
		switch (grade) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Average");
				break;
			case 'C':
				System.out.println("Good");
				break;
			default:
				System.out.println("invaild grade");
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * Average
 * Program Ended
 */