class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    void backtrack(int[] nums,List<Integer> temp, boolean[] used){
        if (temp.size() == nums.length) {
    res.add(new ArrayList<>(temp));
    return;   // MUST stop here
}
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums,temp,used);

             temp.remove(temp.size() - 1); // undo
            used[i] = false;
        }
    }
}