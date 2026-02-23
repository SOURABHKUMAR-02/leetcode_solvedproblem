class Solution {
    public int scoreDifference(int[] nums) {
        int score_1 = 0;
        int score_2 = 0;
        boolean flag_1 = true;
        for (int i = 0; i < nums.length; i++) {
            if (flag_1) {
                if (nums[i] % 2 != 0 && (i + 1) % 6 == 0) {
                    score_1 += nums[i];
                } else if (nums[i] % 2 != 0 || (i + 1) % 6 == 0) {
                    score_2 += nums[i];
                    flag_1 = !flag_1;
                } else {
                    score_1 += nums[i];
                }

            } else {
                if (nums[i] % 2 != 0 && (i + 1) % 6 == 0) {
                    score_2 += nums[i];
                } else if (nums[i] % 2 != 0 || (i + 1) % 6 == 0) {
                    score_1 += nums[i];
                    flag_1 = !flag_1;
                } else {
                    score_2 += nums[i];
                }
            }
        }
        return score_1 - score_2;
    }
}