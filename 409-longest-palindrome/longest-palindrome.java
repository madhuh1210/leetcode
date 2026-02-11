class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        int l=0;
        Boolean hasodd = false;
        for(int i=0; i<128; i++){
            l= l+(count[i]/2)*2;
            if(count[i]%2==1){
                hasodd= true;
            }
        }
        if(hasodd==true){
            l++;
        }
        return l;
    }
}