class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        maxsum=Math.max(leftsum,maxsum);
        for(int i=0;i<k;i++){
            rightsum+=cardPoints[n-i-1];
            leftsum-=cardPoints[k-1-i];
            maxsum=Math.max(rightsum+leftsum,maxsum);
        }
        return maxsum;
    }
}
// class Solution {
//     public int maxScore(int[] cardPoints, int k) {

//         int leftsum = 0;
//         int rightsum = 0;
//         int maxsum = 0;
//         int n = cardPoints.length;
//         for (int i = 0; i < k; i++) {
//             leftsum += cardPoints[i];
//         }
//         maxsum = leftsum;
//         for (int i = 0; i < k; i++) {
//             leftsum -= cardPoints[k - 1 - i];  
//             rightsum += cardPoints[n - 1 - i]; 

//             maxsum = Math.max(maxsum, leftsum + rightsum);
//         }

//         return maxsum;
//     }
// }