class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
           int  sum=0;
        
        for(int j=i;j<nums.length;j++){
            sum=sum+nums[j];
            if(sum==k){
                count++;
            }
        }
        }
           return count;
    }
 

}
//             HashMap<Integer,Integer>map=new HashMap<>();
//  int n =nums.length;

//  int count=0;
//  int curr_sum=0;
//  map.put(0,1);
//  for(int i=0;i<n;i++){
//     curr_sum+=nums[i];
   
//     if(map.containsKey(curr_sum-k)){
//         count+=map.get(curr_sum-k);
//     }
//     map.put(curr_sum,map.getOrDefault ( curr_sum,0)+1);
//  }
//  return count;
// }
// }
// //     int n=nums.length;
// //     int count=0;
// //     for(int i=0;i<n;i++){
// //         int sum =0;
    
// //     for(int j=i;j<n;j++){
// //         sum=sum+nums[j];
// //         if(sum==k){
// //             count++;
// //         }
// //     }
// //     }

// //    return count++;
// //     }
// // }