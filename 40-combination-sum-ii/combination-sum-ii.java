class Solution {
    public void Solve(int i, int arr[], int target, List<Integer> temp, List<List<Integer>> ans){
            if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i; j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if(target<arr[j]) break;
            temp.add(arr[j]);
            Solve(j+1,arr,target-arr[j],temp,ans);
            temp.remove(temp.size()-1);

       }
        }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        Solve(0,candidates, target, new ArrayList<>(),ans);
        return ans;
}
}