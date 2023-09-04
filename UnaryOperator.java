class UnaryOperator {
	public static void main(String[] args) {
		int x = 1;
		int y = x++;
		System.out.println("x: " + x + " y :" + y);

		int a = 1;
		int b = ++a;
		System.out.println("a: " + a + " b :" + b);

		int i = 1;
		int j = i--;
		System.out.println("i: " + i + " j :" + j);

		int p = 1;
		int q = --p;
		System.out.println("p: " + p + " q :" + q);

	}
}