import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // If less than 3 elements, no triplet possible
        if (nums.length < 3) return result;

        // 1️⃣ Sort the array
        Arrays.sort(nums);

        // 2️⃣ Fix one number
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // 3️⃣ Two-pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate second elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate third elements
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
