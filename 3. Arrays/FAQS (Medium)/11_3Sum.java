// 
// Brute Force :
// TC :
// SC :

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int target = 0;

        Set<List<Integer>> Output = new HashSet<>();

        for(int i = 0; i < n -2; i++){
            for(int j = i + 1; j< n -1; j++){
                for(int k = j +1; k < n; k++){
                    if(nums[i]+ nums[j]+ nums[k] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        Output.add(temp);

                    }
                }
            }
        }
        return new ArrayList<>(Output);
   
    }
} 


/*
Optimal :

TC : O(n^2)
SC : O(1)

Approach : 
1. Sort the Array
2. write all required condiotions for f (if f > 0)
3. write all required condtions for i and j
4. Add the triplet to list and i++ , j--
*/

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for (int f = 0; f < n - 2; f++) {

          
            if (f > 0 && nums[f] == nums[f - 1]) {
                continue;
            }

            int i = f + 1;
            int j = n - 1;

            while (i < j) {

                int sum = nums[f] + nums[i] + nums[j];

                if (sum < 0) {
                    i++;
                }

                else if (sum > 0) {
                    j--;
                }

                else {
                    // Found triplet
                    ans.add(Arrays.asList(nums[f], nums[i], nums[j]));

                    i++;
                    j--;

                    // Skip duplicate i
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    // Skip duplicate j
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                }
            }
        }

        return ans;
    }
}