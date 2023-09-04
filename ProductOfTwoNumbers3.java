public class ProductOfTwoNumbers3 {
    public static int multi() {
        System.out.println("Product started");
        int a = 2, b = 20;
        int c = a * b;
        System.out.println("Product of " + a + " and " + b + " is = " + c);
        System.out.println("Product Ended");
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println(multi());
        System.out.println("Main Ended");
    }
}

/*
 * Without Parameter-With Return type
 * Main Started
 * Product started
 * Product of 2 and 20 is = 40
 * Product Ended
 * 40
 * Main Ended
 */