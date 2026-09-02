public static boolean isPrime(int n) {
    if (n <= 1) return false; // edge case

    int count = 0;
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            count++; // i is a factor
            if ((n / i) != i) {
                count++; // n/i is a different factor
            }
        }
    }
    return count == 2;
}