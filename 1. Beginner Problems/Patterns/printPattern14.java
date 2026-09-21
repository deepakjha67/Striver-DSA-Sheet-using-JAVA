/*
https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

A
A B
A B C
A B C D

*/
public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i = 0; i <= n; i++){
            for(char ch = 'A'; ch < 'A'+ i; ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}
