class Practice {
    public static double mini(double a, double b, double c) {
        double min = Math.min(Math.min(a, b), c);
        return min;
    }

    public static void main(String[] args) {
        System.out.println(mini(20, 10, 5));
    }
}
