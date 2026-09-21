public static boolean isArmstrong(int n) {
    int duplicate = n;
    int sum = 0;
    int digits = (int) (Math.log10(n) + 1);

    while (n > 0) {
        int lastDigit = n % 10;
        sum += Math.pow(lastDigit, digits);
        n = n / 10;
    }

    return duplicate == sum;
}