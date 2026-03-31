class Solution {
    public void Solve(int i, int []nums, List<Integer> temp, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        Solve(i+1,nums, temp,ans);
        temp.remove(temp.size()-1);
        Solve(i+1,nums, temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Solve(0, nums, new ArrayList<>(),ans);
        return ans;
    }
}