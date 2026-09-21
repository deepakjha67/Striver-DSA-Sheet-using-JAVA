/*
https://www.naukri.com/code360/problems/rotated-triangle_6573688

*
**
***
****
*****
****
***
**
*
 */

public static void printPattern10(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
        int stars = (i <= n) ? i : (2 * n - i);
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}