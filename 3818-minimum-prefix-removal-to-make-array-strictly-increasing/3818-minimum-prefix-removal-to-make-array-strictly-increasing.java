class Solution {
    public int minimumPrefixLength(int[] nums) {
        int r=nums.length-1;
        int cnt=0;
        while(r>0){
            if(nums[r]<=nums[r-1]){
                break;
            }
            r--;
            cnt++;
        }
      return nums.length-1-cnt;
    }
}