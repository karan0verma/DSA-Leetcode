class Solution {
    public int longestMountain(int[] arr) {
       
        int ans=0;
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            int count=1;
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                {
                    int j=i;
                    while(j>0 && arr[j]>arr[j-1])
                    {
                        count++;
                        j--;
                    }
                    int k=i;
                    while(k<n-1 && arr[k]>arr[k+1])
                    {
                        k++;
                        count++;
                    }
                    ans= Math.max(count, ans);
                }
        }
               return ans;
    }
}