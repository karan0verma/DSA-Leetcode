class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0){
            nums[i]=0;
        }
        else{
            nums[i]=1;
        }
       }
      int i=0;
      int j=0;
      int curr_sum=0;
      int count=0;
      int zerocount=0;
      while(j<n){
        curr_sum+=nums[j];
        while(i<j && (nums[i]==0 || curr_sum>k)){
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
    }
}