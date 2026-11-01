// https://leetcode.com/problems/subsets/description/

class Solution {

    static void solve(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // Add a copy of the current subset to results
            return;
        }

        // Decision 1: Include nums[index]
        current.add(nums[index]);
        solve(index + 1, nums, current, result);

        // Backtrack: Remove the number to explore Decision 2
        current.remove(current.size() - 1);

        // Decision 2: Exclude nums[index]
        solve(index + 1, nums, current, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), result);
        return result;
    }
}
