public static boolean isPalindrome(int n) {
    int duplicate = n;
    int reverse = 0;

    while (n > 0) {
        int lastDigit = n % 10;
        reverse = (reverse * 10) + lastDigit;
        n = n / 10;
    }

    return duplicate == reverse;
}