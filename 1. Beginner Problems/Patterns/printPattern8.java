// https://www.naukri.com/code360/problems/reverse-star-triangle_6573685
/*
*********
 *******
  *****
   ***
    * 
*/
public static void printPattern8(int n) {
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}