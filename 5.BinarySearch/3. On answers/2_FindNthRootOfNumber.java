//https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

// TC : O(log M)
// SC : O(1)

class Solution {
    public int NthRoot(int N, int M) {

      int left = 1;
      int right = M;
      int result = -1;

      while(left <= right){
        int mid = left +(right -left) /2;
        double root =(double)Math.pow(mid, N);

        if(root == M){
          return mid;
        }
        else if(root > M){
          result = -1;
          
          right = mid -1;
        }
        else{
          
          left = mid + 1; 
        }
      }
      return result;
        
    }
}
