// package search_in_2d_matrix;

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
       
//         if(matrix.length==0)
//         {
//             return false;
//         }
        
//         int rows =matrix.length;
//         int cols=matrix[0].length;
        
//         int left=0; // start point & end point
//         int right=rows*cols-1;
        
//         while(left<=right)
//         {
//             int mid=left +(right-left)/2;
            
//             int mid_el=matrix[mid/cols][mid%cols];
            
//             if(mid_el==target)
//             {
//                 return true;
//             }
//             else if(target<mid_el)
//             {
//                 right=mid-1;
//             }
//             else{
//                 left = mid+1;
//             }
//         }
//         return false;
        
//     }
// }



