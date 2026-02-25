class Solution {
    public int[] sortByBits(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;

            while (num > 0) {
                cnt += (num & 1);
                num >>= 1;
            }

            map.put(arr[i], cnt);
        }

        Arrays.sort(arr, (a, b) -> {
            int bitA = map.get(a);
            int bitB = map.get(b);

            if (bitA == bitB)
                return a - b;

            return bitA - bitB;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}