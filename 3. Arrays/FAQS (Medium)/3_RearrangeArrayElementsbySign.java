// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

// Brute Force :

// TC : O(2n)
// SC : O(n)

class Solution1 {
    public int[] rearrangeArray(int[] nums) {

        ArrayList <Integer> pos = new ArrayList <>();
        ArrayList <Integer> neg = new ArrayList <>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }


        }

        int n = nums.length;
        int [] ans = new int[n];
        for(int i = 0; i < n/2; i++){
            ans[2 * i] = pos.get(i);
            ans[2 * i + 1] = neg.get(i);
        }
        return ans;
        
    }
}

// Optimised Brute Force :

// TC : O(n)
// SC : O(n)

class Solution2 {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int [] ans = new int [n];

        int posIndex = 0;
        int negIndex = 1;
        for(int i = 0; i <= n-1; i++){
            if(nums[i] > 0){
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
            else {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        return ans;
        
    }
}

// Varient 2 (Positive != negative)

// TC : O(2n)
// SC : O(n)


class Solution3 {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }

            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(index++, pos.get(i));
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index++, neg.get(i));
            }
        }
    }
}