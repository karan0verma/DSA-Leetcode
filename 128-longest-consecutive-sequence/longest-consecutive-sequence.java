class Solution {
    public int longestConsecutive(int[] nums) {
   HashSet<Integer> set= new HashSet<>();
   if(nums.length==0) return 0;

   for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
   }
   int longest=0;
  
   for(int num:set){
     int currentsum=num;
    if(!set.contains(currentsum-1)){
        int temp=currentsum;
        int count=1;
    
    while(set.contains(temp+1)){
        count++;
        temp++;
         
    }
     longest=Math.max(longest, count);
    }
  
   }
  return longest;
    }
}