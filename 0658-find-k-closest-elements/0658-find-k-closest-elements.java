class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int d1 = Math.abs(a - x);
            int d2 = Math.abs(b - x);

            if (d1 == d2) {
                return a - b;
            }
            return d1 - d2;
        });
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (k > 0) {
            l.add(pq.poll());
            k--;
        }
        Collections.sort(l);
        return l;
    }
}