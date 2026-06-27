class Solution {
    public int majorityElement(int[] nums) {
        int can =0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(count==0){
                can = n;
                count=1;
            }
            else if(can== n){
                count++;
            }
            else{
                count--;
            }
        }
        return can;
}
}