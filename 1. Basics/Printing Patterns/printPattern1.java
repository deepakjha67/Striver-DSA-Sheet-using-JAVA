/*

* * * * *  <- Rows
* * * * *
* * * * *
* * * * *
* * * * *

*/
public static void printPattern1(int n) {
    for (int i = 0; i < n; i++) {         // Step 1: Outer loop = rows
        for (int j = 0; j < n; j++) {     // Step 2: Inner loop = columns
            System.out.print("* ");       // Step 3: Print inside inner loop
        }
        System.out.println();             // New line after each row
    }
}
