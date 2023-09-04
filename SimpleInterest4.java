public class SimpleInterest4 {
    public static double multi(double P, double R, double T) {
        System.out.println("PTR started");
        double SI = (P * T * R) / 100;
        System.out.println("PTR Ended");
        return SI;
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println(multi(1500, 10, 2));
        System.out.println("Main Ended");
    }
}

/*
 * With Parameter-With Return type
 * Main Started
 * PTR started
 * PTR Ended
 * 300.0
 * Main Ended
 */