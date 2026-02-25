class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int dp[][] = new int[n + 1][target + 1];
        int max_len = 0;
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        dp[0][0]=0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int skip = dp[i - 1][j];
                int take = -1;
                if (nums.get(i - 1) <= j &&dp[i - 1][j - nums.get(i - 1)]!=-1) {
                    take = dp[i - 1][j - nums.get(i - 1)] + 1;
                }
                dp[i][j] = Math.max(take, skip);
               
            }
        }
        return dp[n][target];
    }
}