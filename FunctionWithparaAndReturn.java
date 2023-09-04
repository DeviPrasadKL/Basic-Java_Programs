//Combine Addition function and squaring function (Sequence function call, with paramerter and return type)

class FunctionWithparaAndReturn {
    public static int add(int a, int b) {
        System.out.println("Addition Started");
        int c = (a + b);
        System.out.println("Addition Ended");
        return c;
    }

    public static int sqr(int n) {
        System.out.println("Squaring Started");
        int sq = n * n;
        System.out.println("Squaring Ended");
        return sq;
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println(add(10, 20));
        System.out.println(add(100, 420));
        System.out.println(sqr(5));
        System.out.println(sqr(25));
        System.out.println("Main Ended");
    }
}

/*
 * Main Started
 * Addition Started
 * Addition Ended
 * 30
 * Addition Started
 * Addition Ended
 * 520
 * Squaring Started
 * Squaring Ended
 * 25
 * Squaring Started
 * Squaring Ended
 * 625
 * Main Ended
 */