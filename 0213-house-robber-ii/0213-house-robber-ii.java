class Solution {
    int max=Integer.MIN_VALUE;
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
       
      return Math.max(hr(nums,0,nums.length-2),hr(nums,1,nums.length-1));
       
    }
    public int hr(int[]nums,int s,int e){
       int dp[]=new int[e-s+1];
       dp[0]=nums[s];
       if(e-s+1==1)return dp[0];
       dp[1]=Math.max(nums[s],nums[s+1]);
       
        for( int i=2; i<dp.length; i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[s+i]);
        }
        return dp[dp.length-1];
    }
     /*public int hr(int[]nums,int i,int n,Integer memo[]){
        if(i>=n){
            return 0;
        }
        if(memo[i]!=null)return memo[i];
        int steal=nums[i]+hr(nums,i+2,n,memo);
        int skip=hr(nums,i+1,n,memo);
        memo[i]=Math.max(steal,skip);
        return memo[i];
    }
    */
}