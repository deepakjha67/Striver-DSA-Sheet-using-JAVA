// https://leetcode.com/problems/intersection-of-two-arrays/



import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements of nums1 into the HashSet
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Check elements of nums2
        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);

                // Remove it so duplicates are not added
                set.remove(nums2[i]);
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}