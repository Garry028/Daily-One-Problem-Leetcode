// import java.util.*;
// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         int left = 0;
//         int right = 0;
//         Set<Character> seen = new HashSet();
//        // the set used because it cannot contain the duplicate elements
//         int max = 0;

//         while (right < s.length()) {
//             char c = s.charAt(right);
//             if(seen.add(c)) { // add the right charcter to the set and then increament the pointer
//               // max is the  maxx of max  & size of the window without duplicates
//                 max = Math.max(max, right - left + 1);
//                 right++;
//             } else {
//                 // we found duplicate
//                 while (s.charAt(left) != c) // untill we found the duplicate before the duplicate we want
//                 {
//                     seen.remove(s.charAt(left));
//                     left++;
//                 }
//                 // remove duplicate that we want
//                 seen.remove(c);
//                 left++;
//             }
//         }
//         return max;
//     }
// }