class Switch1 {
	public static void main(String[] args) {
		int choice = 1;
		System.out.println("Program Started");
		switch (choice) {
			case 1:
				System.out.println("in case 1");
				break;
			case 2:
				System.out.println("in case 2");
				break;
			case 3:
				System.out.println("in case 3");
				break;
			default:
				System.out.println("invaild");
		}
		System.out.println("Program Ended");
	}
}

/*
 * Program Started
 * in case 1
 * Program Ended
 */