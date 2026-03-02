class Solution {
    public int dominantIndices(int[] nums) {
        int suff[]=new int[nums.length];
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            suff[i]=suff[i+1]+nums[i];
        }
        int cnt=0;
        for(int i=0; i<nums.length-1; i++){
            float avg=(float)(suff[i+1])/(nums.length-1-i);
            if(nums[i]>avg){
                cnt++;
            }
        }
        return cnt;
    }
}