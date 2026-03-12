class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        int t = 0;

        while (j < n) {
            if (j > 0 && nums[j - 1] + 1 != nums[j] && k > 1) {
                l.add(nums[j - 1]);
            }
            if (j - i + 1 == k) {
                if (l.size() == 0) {
                    ans[t++] = nums[j];
                } else {
                    ans[t++] = -1;
                }
                if (l.size() > 0 && l.get(0) == nums[i])
                    l.remove(0);
                i++;
            }
            j++;
        }
        return ans;

    }
}