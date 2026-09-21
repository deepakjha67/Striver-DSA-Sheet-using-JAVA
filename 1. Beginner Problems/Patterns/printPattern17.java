/*
https://www.naukri.com/code360/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/
public static void printPattern17(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Characters
        char ch = 'A';
        int breakpoint = (2 * i + 1) / 2;
        for (int j = 1; j <= 2 * i + 1; j++) {
            System.out.print(ch);
            if (j <= breakpoint) ch++;
            else ch--;
        }
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}