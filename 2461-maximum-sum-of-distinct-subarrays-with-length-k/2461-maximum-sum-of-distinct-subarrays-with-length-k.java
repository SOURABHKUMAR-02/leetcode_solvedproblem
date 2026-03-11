class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        long maxsum = 0, sum = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            set.add(nums[j]);
            sum += nums[j];
            if (j - i + 1 == k) {
                if (set.size() == k)
                    maxsum = Math.max(sum, maxsum);
                map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
                sum -= nums[i];
                if (map.get(nums[i]) <= 0)
                    set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return maxsum;
    }
}