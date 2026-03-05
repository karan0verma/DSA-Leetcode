class Solution {
    public void setZeroes(int[][] matrix) {
           int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }

                for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<matrix[0].length;j++){
                        if(row[i]==-1 || col[j]==-1){
                            matrix[i][j]=0;
                        }
                    }
                }
    }
        }
        // int row=matrix.length;
        // int col=matrix[0].length;
        // boolean firstrowzero=false;
        // boolean firstcolzero=false;
        // for(int j=0;j<col;j++){
        //     if(matrix[0][j]==0){
        //         firstrowzero=true;
        //     }
        // }
        // for(int i=0;i<row;i++){
        //     if(matrix[i][0]==0){
        //         firstcolzero=true;
        //     }
        // }
        // for(int i=1;i<row;i++){
        //     for(int j=1;j<col;j++){
        //         if(matrix[i][j]==0){
        //             matrix[i][0]=0;
        //             matrix[0][j]=0;
        //         }
        //     }
        // }
        // for(int i=1;i<row;i++){
        //     for(int j=1;j<col;j++){
        //         if(matrix[i][0]==0 || matrix[0][j]==0){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        // if(firstrowzero){
        //     for(int j=0;j<col;j++){
        //         matrix[0][j]=0;
        //     }
        // }
        //  if(firstcolzero){
        //     for(int i=0;i<row;i++){
        //         matrix[i][0]=0;
        //     }
        // }
//     }
// }