public class SimpleInterest {
    public static void multi() {
        System.out.println("PTR started");
        double P = 1500, R = 10, T = 2;
        double SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
        System.out.println("PTR Ended");
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
 * PTR started
 * Simple interest = 300.0
 * PTR Ended
 * Main Ended
 */