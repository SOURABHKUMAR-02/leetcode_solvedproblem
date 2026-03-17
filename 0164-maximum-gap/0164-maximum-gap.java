class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max_diff = 0;
        for (int i = 1; i < nums.length; i++) {
            max_diff = Math.max(max_diff, nums[i] - nums[i - 1]);
        }
        return max_diff;
    }
}