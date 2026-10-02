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