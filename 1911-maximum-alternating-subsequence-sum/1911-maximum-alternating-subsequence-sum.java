class Solution {
    public long maxAlternatingSum(int[] nums) {
        long dp[][]=new long[nums.length+1][2];
        if(nums.length==1)return nums[0];
       dp[0][0]=0;
       dp[0][1]=0;
        for(int i=1; i<dp.length; i++){
            dp[i][0]=Math.max(dp[i-1][1]+nums[i-1],dp[i-1][0]);
            dp[i][1]=Math.max(dp[i-1][0]-nums[i-1],dp[i-1][1]); 
        }
        return Math.max(dp[nums.length][0],dp[nums.length][1]);
    }
}  
     /*
      class Solution {
      public long maxAlternatingSum(int[] nums) {
        Long dp[][]=new Long[nums.length][2];
        return rec(nums,dp,0,1);
    }
     public long rec(int nums[],Long dp[][],int i,int f){
        if(i>=nums.length)return 0;
        if(dp[i][f]!=null)return dp[i][f];
        int val=nums[i];
         if(f==0){
            val=-1*val;
         }
        long x= val+rec(nums,dp,i+1,1-f);
        long y=rec(nums,dp,i+1,f);
        return dp[i][f]= Math.max(x,y);
    }
    }*/
