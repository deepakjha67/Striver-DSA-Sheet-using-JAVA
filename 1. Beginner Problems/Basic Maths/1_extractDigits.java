public static void extractDigits(int n) {
    while (n > 0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit + " ");
        n = n / 10;
    }
}
// Output for 7789: 9 8 7 7