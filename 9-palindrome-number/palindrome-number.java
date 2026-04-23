class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int revn=0;
        while(x>revn){
            revn= revn*10+x%10;
            x=x/10;
        }
        return (revn==x || revn/10==x);
}
}