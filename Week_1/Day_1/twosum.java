class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        for(int i = 0 ; i < n - 1 ; i++){
            if((nums[i] + nums[i + 1]) == target){
                ans[0] = i;
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}