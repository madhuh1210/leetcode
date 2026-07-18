class Solution {
    public int pivotIndex(int[] nums) {

        for(int pivot = 0; pivot < nums.length; pivot++) {

            int leftsum = 0;
            int rightsum = 0;

            // Left sum
            for(int i = 0; i < pivot; i++) {
                leftsum += nums[i];
            }

            // Right sum
            for(int i = pivot + 1; i < nums.length; i++) {
                rightsum += nums[i];
            }

            if(leftsum == rightsum) {
                return pivot;
            }
        }

        return -1;
    }
}