class Practice2 {
    public static void main(String[] args) {
        int num = 505;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}