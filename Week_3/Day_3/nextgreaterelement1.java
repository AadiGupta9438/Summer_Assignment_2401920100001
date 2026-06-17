class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            boolean check = false;
            int nge = -1;
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    check = true;
                }
                if(check){
                    if(nums2[j] > nums1[i]){
                        nge = nums2[j];
                        break;
                    }
                }
            }
            ans[i] = nge;
        }
        return ans;
    }
}