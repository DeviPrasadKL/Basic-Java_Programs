public class ProductOfTwoNumbers {
    public static void multi() {
        System.out.println("Product started");
        int a = 2, b = 40;
        int c = a * b;
        System.out.println("Product of " + a + " and " + b + " is = " + c);
        System.out.println("Product Ended");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        multi();
        System.out.println("Main Ended");
    }
}

/*
 * Without Parameter-Without Return type
 * Main Started
 * Product started
 * Product of 2 and 40 is = 80
 * Product Ended
 * Main Ended
 */