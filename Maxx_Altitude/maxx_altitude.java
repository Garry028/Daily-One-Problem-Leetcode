// class Solution {
//     public int largestAltitude(int[] gain) {
//         int current=0;
//         int maxx=0;
    
//         for(int i=0;i<gain.length;i++)
//         {
//             // initially biker is at zero then it adds the different altitudes
//            current=current+gain[i];
//            maxx=Math.max(current,maxx); // maxximum means maxx between the current pt and the previous maxx
//         }
//         return maxx;
//     }
// }
// // TC -> O(n)
// // SC -> O(1)