//W a p to find average of 3 numbers

class AvgNumber {
    public static double mini(double a, double b, double c) {
        double min = (a + b + c) / 3;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(mini(20, 10, 5));
    }
}