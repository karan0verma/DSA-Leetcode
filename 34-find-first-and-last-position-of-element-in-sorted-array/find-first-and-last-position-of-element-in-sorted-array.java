class Solution {
    public static int FirstOccurance(int low, int high, int target, int nums[]){
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
                if(nums[mid]==target){
                    ans=mid;
                    high=mid-1;
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
        }
        return ans;
    }

    public static int SecondOccurance(int low, int high, int target, int nums[]){
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
                if(nums[mid]==target){
                    ans=mid;
                    low=mid+1;
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int [] ans= new int[2];
        ans[0]= FirstOccurance(0, n-1, target, nums);
        ans[1]= SecondOccurance(0, n-1, target, nums);
            return ans;
}
}