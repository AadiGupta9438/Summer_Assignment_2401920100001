class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while(l < r){
            int vol = Math.min(height[l] , height[r]) * (r - l);
            ans = Math.max(ans , vol);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}