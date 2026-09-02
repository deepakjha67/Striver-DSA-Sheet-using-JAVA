/*
https://www.naukri.com/code360/problems/binary-number-triangle_6581890?leftPanelTabValue=PROBLEM

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/
public static void printPattern11(int n) {
    for (int i = 0; i < n; i++) {
        int start = (i % 2 == 0) ? 1 : 0;
        for (int j = 0; j <= i; j++) {
            System.out.print(start + " ");
            start = 1 - start;  // Flip 0 to 1 and 1 to 0
        }
        System.out.println();
    }
}