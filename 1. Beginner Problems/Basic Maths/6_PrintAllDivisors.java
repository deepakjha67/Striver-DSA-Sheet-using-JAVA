// public static void printDivisorsBrute(int n) {
//     for (int i = 1; i <= n; i++) {
//         if (n % i == 0) {
//             System.out.print(i + " ");
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Collections;

public static void printDivisorsOptimized(int n) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            list.add(i);
            if ((n / i) != i) {
                list.add(n / i);
            }
        }
    }

    Collections.sort(list);

    for (int num : list) {
        System.out.print(num + " ");
    }
}
// Time Complexity: O(√n + d log d)