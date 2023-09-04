//Write a function to find squareof number (with parameter & without return type)

class FunctionSqrWP {
    public static void sqr(int n) {
        System.out.println("Squaring Started");
        int sq = n * n;
        System.out.println(sq);
        System.out.println("Squaring Ended");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        sqr(5);
        sqr(15);
        sqr(123);
        System.out.println("Main Ended");
    }
}

/*
 * Main Started
 * Squaring Started
 * 25
 * Squaring Ended
 * Squaring Started
 * 225
 * Squaring Ended
 * Squaring Started
 * 15129
 * Squaring Ended
 * Main Ended
 */