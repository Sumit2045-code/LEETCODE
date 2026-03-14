class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!ans.contains(nums[i])){
                    ans.add(nums[i]);
                }
            }
        for(int i=0 ; i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        return ans.size();
    }
}