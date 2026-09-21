// https://www.naukri.com/code360/problems/star-triangle_6573671?leftPanelTabValue=PROBLEM

/*
    *
   ***
  *****
 *******
*********
*/
public static void printPattern7(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}