class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
          if (nums.length == 0) return 0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
           
        }
         int longest=0;
        for(int num : set){
           int currentnum=num;
           if(!set.contains(currentnum-1)){
            int temp=currentnum;
           int count=1;
            while(set.contains(temp+1)){
                temp++;
                count++;
            }
            longest=Math.max(longest,count);
           }
        }
    return longest;
    }
}