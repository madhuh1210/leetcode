class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;

       
        if (n == 1) return 0;

        
        if (nums[0] > nums[1]) return 0;

        
        for (int i = 1; i < n - 1; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            int next = nums[i + 1];

            if (curr > prev && curr > next) {
                return i;
            }
        }

        
        return n - 1;
    }
}