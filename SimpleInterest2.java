public class SimpleInterest2 {
    public static double multi() {
        System.out.println("PTR started");
        double P = 1500, R = 10, T = 2;
        double SI = (P * T * R) / 100;
        System.out.println("PTR Ended");
        return SI;
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println(multi());
        System.out.println("Main Ended");
    }
}

/*
 * Without Parameter-With Returntype
 * Main Started
 * PTR started
 * PTR Ended
 * 300.0
 * Main Ended
 */