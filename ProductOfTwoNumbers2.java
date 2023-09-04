public class ProductOfTwoNumbers2 {
    public static void multi(int a, int b) {
        System.out.println("Product started");
        int c = a * b;
        System.out.println("Product of " + a + " and " + b + " is = " + c);
        System.out.println("Product Ended");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        multi(2, 40);
        System.out.println("Main Ended");
    }
}

/*
 * With Parameter-Without Return type
 * Main Started
 * Product started
 * Product of 2 and 40 is = 80
 * Product Ended
 * Main Ended
 */