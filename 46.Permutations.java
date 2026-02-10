class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        perms.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> newPerms = new ArrayList<>();
            for(List<Integer> perm: perms){
                for(int i=0; i<=perm.size(); i++){

                     List<Integer> newPerm = new ArrayList<>(perm); 
                    newPerm.add(i,num);
                    newPerms.add(newPerm);
                }
            }
            perms = newPerms;
        }
        return perms;
    }
}
        
