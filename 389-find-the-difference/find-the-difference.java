class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[128];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        for(int i=0; i<t.length(); i++){
            count[t.charAt(i)]--;
        }
        for(int i=0; i<128; i++){
            if(count[i]!=0) return (char) i;
        }
        return ' ';
    }
}