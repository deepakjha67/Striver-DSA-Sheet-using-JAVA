public static int gcdBrute(int a, int b) {
    int gcd = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }
    return gcd;
}

// Euclidean Algorithm

/*
public static int gcd(int a, int b) {
    while (a > 0 && b > 0) {
        if (a > b) {
            a = a % b;
        } else {
            b = b % a;
        }
    }
    if (a == 0) return b;
    return a;
}
*/
// Time Complexity: O(log φ(min(a, b)))