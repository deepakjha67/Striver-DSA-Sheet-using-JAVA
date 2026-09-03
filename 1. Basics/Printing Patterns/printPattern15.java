/*
https://www.naukri.com/code360/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

A B C D E
A B C D
A B C
A B
A

*/

public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i = n; i >= 1; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}