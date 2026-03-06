class Solution {
    public long minCost(String s, int[] cost) {

        long min_cost = 0;
        long arr[] = new long[26];
        long total_cost = 0;
        for (int i = 0; i < cost.length; i++) {
            total_cost+= cost[i];
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += cost[i];
        }
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return total_cost - max;
    }
}