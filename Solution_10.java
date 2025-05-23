class Solution_10{
    public static int Subsequence(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 1;
        for (int i=0;i<n;i++) {
            dp[i]= 1;
            for (int j=0;j<i;j++) {
                if (nums[j]>nums[i]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}