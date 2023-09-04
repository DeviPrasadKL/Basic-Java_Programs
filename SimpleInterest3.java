public class SimpleInterest3 {
    public static void multi(double P, double R, double T) {
        System.out.println("PTR started");
        double SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
        System.out.println("PTR Ended");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        multi(1500, 10, 2);
        System.out.println("Main Ended");
    }
}

/*
 * With Parameter-Without Return type
 * Main Started
 * PTR started
 * Simple interest = 300.0
 * PTR Ended
 * Main Ended
 */