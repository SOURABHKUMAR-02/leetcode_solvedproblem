class Solution {
    public String maximumXor(String s, String t) {
        int cnt_0 = 0;
        int cnt_1 = 0;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '0')
                cnt_0++;
            else cnt_1++;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0' && cnt_1-- > 0) {
                sb.append('1');
            } else if (ch == '1' && cnt_0-- > 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}