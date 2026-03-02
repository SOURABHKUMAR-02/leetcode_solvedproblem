class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();
        stack.push((long) nums[0]);
        for (int i = 1; i < nums.length; i++) {
            long a = (long) nums[i];
            if (!stack.isEmpty() && a == stack.peek()) {
                a = 2 * stack.pop();
                while (!stack.isEmpty() && a == stack.peek()) {
                    a = 2 * stack.pop();

                }
                stack.push((long) a);
            } else {
                stack.push((long) nums[i]);
            }
        }
        List<Long> l = new ArrayList<>();
        while (!stack.isEmpty()) {
            l.add(stack.pop());
        }

        Collections.reverse(l);
        return l;
    }
}