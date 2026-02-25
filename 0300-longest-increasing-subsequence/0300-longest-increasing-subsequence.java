class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        dp[0]=0;
        int maxlen=0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<i; j++){
                if(nums[j-1]<nums[i-1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}