class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0,j=0,count=0;
        int n=nums.length;
        int max_element=-9999;
        int[] ans=new int [n-k+1];
        if(n==1 || k==1) return nums;
        TreeMap<Integer,Integer>map=new TreeMap<>();
              while(j<n)
        {
            // max_element=Math.max(nums[j],max_element);
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j-i+1>k){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                // shrinking case
                // map.remove(nums[i]);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                // map.put(nums[i],map.getORDefault(nums[i],0)+1);
                i++;
            }
            if(j-i+1==k)
            {
                ans[count]=map.lastKey();
                count++;
            }
            j++;
        }
        return ans;
    }
}
        //  int sum = 0;
        // int max_sum=0;
        // int i=0,j=0;
        // int n=nums.length;
        // while(j<n){
        //     if(j-i+1<k){
        //         sum+=nums[j];
        //         j++;
        //     }
        //     else{
        //         sum=sum+nums[j];
        //         max_sum=Math.max(max_sum,sum);
        //         sum=sum-nums[i];
        //         i++;
        //         j++;
        //     }
        // }
        // return max_sum;
//     }
// }
