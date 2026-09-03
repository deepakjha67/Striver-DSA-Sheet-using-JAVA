/*
https://www.naukri.com/code360/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

A
B B
C C C
D D D D

*/
public class Solution {
    public static void alphaRamp(int n) {
        for(int i = 1; i<=n; i++){
            char ch = (char) ('A'+ i -1 );
            for(int j = 1; j  <= i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}