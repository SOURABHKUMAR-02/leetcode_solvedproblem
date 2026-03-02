class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int d=0;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetter(ch))d++;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')v++;  
        }
        if(v+d==s.length())return 0;
        return v/(s.length()-v-d);
    }
}