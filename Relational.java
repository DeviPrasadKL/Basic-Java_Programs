class Relational {
	public static void main(String[] args) {
		double c = 10.0, e = 30.0;
		float d = 10.0f, f = 5.0f;

		// for c and e values
		System.out.println(c < e); // true
		System.out.println(c > e); // false
		System.out.println(c <= e); // true
		System.out.println(c >= e); // false
		System.out.println(c == e); // false
		System.out.println(c != e); // true

		// for d and f values
		System.out.println(d < f); // false
		System.out.println(d > f); // true
		System.out.println(d <= f); // false
		System.out.println(d >= f); // true
		System.out.println(d == f); // false
		System.out.println(d != f); // true

	}
}