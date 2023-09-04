class Logical {
	public static void main(String[] args) {

		// For AND(&&) Operator
		int a = 20, b = 40;
		System.out.println((a < b) && (a > b)); // false
		System.out.println((a < b) && (a <= b)); // true
		System.out.println((a < b) && (a >= b)); // false
		System.out.println((a < b) && (a == b)); // false
		System.out.println((a < b) && (a != b)); // true

		int c = 40, d = 10;
		System.out.println((c > d) && (c < d)); // false
		System.out.println((c > d) && (c <= d)); // false
		System.out.println((c > d) && (c >= d)); // true
		System.out.println((c > d) && (c == d)); // false
		System.out.println((c > d) && (c != d)); // true

		// For OR(||) Operator
		System.out.println((a < b) || (a > b)); // true
		System.out.println((a < b) || (a <= b)); // true
		System.out.println((a < b) || (a >= b)); // true
		System.out.println((a > b) || (a == b)); // false
		System.out.println((a < b) || (a != b)); // true

		System.out.println((c > d) || (c < d)); // true
		System.out.println((c > d) || (c <= d)); // true
		System.out.println((c > d) || (c >= d)); // true
		System.out.println((c < d) || (c == d)); // false
		System.out.println((c > d) || (c != d)); // true

		// For NOT(!) Operator
		System.out.println(!(a < b)); // false
		System.out.println(!(a > b)); // true
		System.out.println(!(a <= b)); // false
		System.out.println(!(a >= b)); // true
		System.out.println(!(a == b)); // true

		System.out.println(!(c < d)); // true
		System.out.println(!(c > d)); // false
		System.out.println(!(c <= d)); // true
		System.out.println(!(c >= d)); // false
		System.out.println(!(c == d)); // true

	}
}
