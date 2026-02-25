class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map =new HashMap<>();
    int n=nums.length;
    int count=0;
    int current_sum=0;
    map.put(0,1);
    for(int i=0;i<n;i++){
        current_sum+=nums[i];
    
    if (map.containsKey(current_sum-goal)){
    count+=map.get(current_sum-goal);
    }
    map.put(current_sum,map.getOrDefault(current_sum,0)+1);
    }
    return count;
}
}
    