class Solution {
    public int bitwiseComplement(int n) {
        char ch[] = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0')
                ch[i] = '1';
            else
                ch[i] = '0';
        }
        return Integer.parseInt(new String(ch),2);
    }
}