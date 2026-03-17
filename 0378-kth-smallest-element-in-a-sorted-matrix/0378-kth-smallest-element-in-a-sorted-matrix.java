class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.offer(matrix[i][j]);
            }
        }
        int cnt = 0;
        while (!pq.isEmpty()) {
            cnt++;
            int x = pq.poll();
            if (cnt == k)
                return x;
        }
        return -1;
    }
}