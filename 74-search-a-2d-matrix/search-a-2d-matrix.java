class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         int row= matrix.length;
//         int col=matrix[0].length;
//         int [] arr= new int[row*col];
//         int count=0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[count]=matrix[i][j];
//                 count++;
//             }
//         }
//     Arrays.sort(arr);

//     int low=0;
//     int high=arr.length-1;
//     while(low<=high){
//         int mid= low+((high-low)/2);
//         if(arr[mid]==target){
//             return true;
//         }
//         else if(arr[mid]<target){
//             low=mid+1;
//         }
//         else{
//             high=mid-1;
//         }
//     }
//     return false;
//     }
// }
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            int row=mid/n;
            int col=mid%n;
            // int i=mid/col.length;
            // int j=mid%col.length;
            if( matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
        return false;
    }
}