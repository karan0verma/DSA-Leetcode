// class Solution {
//     public int search(int[] nums, int target) {
//         int n=nums.length;
//         int low=0;
//         int high=n-1;
//         while(low<=high){
            // int mid=(low+high)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]<target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return -1;
//     }
// }
class Solution{
    public  int search(int[] nums, int target){
        return solve(0,nums.length-1,nums, target);
    }
    public  static int solve(int low, int high, int[] nums, int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                  return solve(mid + 1, high, nums, target);
            }
            else{
               return solve(low, mid-1, nums, target);
            }
    }
}
