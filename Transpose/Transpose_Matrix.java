// class Solution {
//     public int[][] transpose(int[][] matrix) {
        
//         int r = matrix.length;
//         int c = matrix[0].length;
        
//         int [][]B = new int [c][r];
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[i].length;j++)
//             {
//                 B[j][i]=matrix[i][j];
//             }
//         }
//         return B;
//     }
// }

// O(n^2) TC
// O(n)   SC