class Solution {
    public boolean isDigitorialPermutation(int n) {
        int arr[] = new int[10];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * i;
        }
        int cp = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += arr[r];
            n = n / 10;
        }

        char ch[] = Integer.toString(sum).toCharArray();
        char s[] = Integer.toString(cp).toCharArray();
        Arrays.sort(ch);
        Arrays.sort(s);
        return Arrays.equals(ch, s);
  
    }
}