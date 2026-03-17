class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<String> l = new ArrayList<>();

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int d1 = map.get(a);
            int d2 = map.get(b);
            if (d1 == d2) {
                return a.compareTo(b);
            }
            return d2 - d1;
        });
        for (String s : map.keySet()) {
            pq.offer(s);
        }
        while (k-- > 0 && !pq.isEmpty()) {
            l.add(pq.poll());
        }
        return l;
    }
}