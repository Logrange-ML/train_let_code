class Solution{
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int pre = nums[0];
        int ans = nums[0];

        for (int i = 1; i<n; i++){
            pre = Math.max(pre + nums[i], nums[i]);
            ans = Math.max(pre, ans);

        }

        return ans;
    }
}