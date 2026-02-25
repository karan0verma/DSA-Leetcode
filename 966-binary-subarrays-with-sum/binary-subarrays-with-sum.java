class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
          int i=0;
        int n=nums.length;
        int j=0;
        int count=0;
        int zerocount=0;
        int curr_sum=0;
        while(j<n){
            curr_sum+=nums[j];
            while(i<j && (curr_sum>k || nums[i]==0)){
                if(nums[i]==0){
                    zerocount++;
                }
                else{
                    zerocount=0;
                }
                curr_sum-=nums[i];
                i++;
            }
            if(curr_sum==k){
                count+=1+zerocount;
            }
            j++;

        }

        return count;
      
    // HashMap<Integer,Integer>map =new HashMap<>();
    // int n=nums.length;
    // int count=0;
    // int current_sum=0;
    // map.put(0,1);
    // for(int i=0;i<n;i++){
    //     current_sum+=nums[i];
    
    // if (map.containsKey(current_sum-goal)){
    // count+=map.get(current_sum-goal);
    // }
    // map.put(current_sum,map.getOrDefault(current_sum,0)+1);
    // }
    // return count;
}
}  
    