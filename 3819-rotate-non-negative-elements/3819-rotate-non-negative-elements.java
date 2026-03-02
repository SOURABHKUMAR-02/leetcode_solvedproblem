class Solution {
    public void swap(int rev[], int s, int e) {
        while (s <= e) {
            int temp = rev[s];
            rev[s] = rev[e];
            rev[e] = temp;
            s++;
            e--;
        }
    }

    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        if (k == 0 || k == n)
            return nums;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0)
                cnt++;
        }
        if(cnt==0)return nums;
        int rev[] = new int[cnt];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                rev[p++] = nums[i];
            }
        }
        k %= cnt;
        swap(rev, 0, k - 1);
        swap(rev, k, cnt - 1);
        swap(rev, 0, cnt - 1);
        p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rev[p++];
            }
        }
        return nums;
    }
}