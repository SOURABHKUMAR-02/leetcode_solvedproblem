class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set=new HashSet<>();
        StringBuilder sb=new StringBuilder("");
        int i=0;
        int j=0;
        int cnt=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            sb.append(ch);
            if(j-i+1==k){
               String str=sb.toString();
                if(!set.contains(str)){
                  cnt++;
                  set.add(str);
                }
                sb.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return cnt==Math.pow(2,k);
    }
}