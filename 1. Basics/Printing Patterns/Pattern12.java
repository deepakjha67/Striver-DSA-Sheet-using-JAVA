/*
https://www.naukri.com/code360/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM

1        1
12      21
123    321
1234  4321
1234554321

*/
public class Pattern12 {
    public static void numberCrown(int n) {
        // Write your code here.
        int space = 2 * (n-1);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            // Space
            for(int j = 1; j <=space; j++ ){
                System.out.print(" ");
            }
            // Reverse Numbers
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }  
            System.out.println();   
        }
    }
}