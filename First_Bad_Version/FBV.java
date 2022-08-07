// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
        
//         int start=1;
//         int end=n;
//         int res=n;// means end product will always be bad
//         while(start<=end)
//         {
//             int mid=start+(end-start)/2;
            
//             if(isBadVersion(mid))
//             {
//                 res = mid;// store the result as mid
//                 end = mid-1; // also move end as mid-1 then check in that part 
//             }
//             else {
//                 // if mid is not bad product then search in right side products
//                 start= mid+1;
//             }
//         }
//         return res;
//     }
// }