class AssignmentOperator {
	public static void main(String[] args) {

		// Diffrent variables and values
		int a = 10;
		int b = 5;
		int c = 3;
		int d = 15;
		int e = 9;
		System.out.println(a += 5); // 15
		System.out.println(b -= 3); // 2
		System.out.println(c *= 4); // 12
		System.out.println(d /= 10); // 1
		System.out.println(e %= 2); // 1

		// Variable value reassigning step by step
		// a value is already 15
		System.out.println(a += 5); // a(15)+5=20
		System.out.println(a -= 7); // a(20)-7=13
		System.out.println(a *= 4); // a(13)*4=52
		System.out.println(a /= 3); // a(52)/3=17
		System.out.println(a %= 2); // a(17)%2=1

	}
}