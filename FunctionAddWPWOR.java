//Write a function to find addition of two numbers(with parameter & without return type)

class FunctionAddWPWOR {
    public static void add(int a, int b) {
        System.out.println("Addition Started");
        int sum = (a + b);
        System.out.println(sum);
        System.out.println("Addition Started");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        add(10, 30);
        add(420, 840);
        add(200, 185);
        System.out.println("Main Ended");
    }
}

/*
 * Main Started
 * Addition Started
 * 40
 * Addition Started
 * Addition Started
 * 1260
 * Addition Started
 * Addition Started
 * 385
 * Addition Started
 * Main Ended
 */