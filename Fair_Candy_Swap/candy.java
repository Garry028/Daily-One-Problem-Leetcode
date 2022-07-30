// package Fair_Candy_Swap;

// public class candy {
    
//         public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
//             Set<Integer> bCandy = new HashSet();
//             int[] ans = new int[2];
//             int aliceSum=0;
//             int bobSum=0;
//             for(int x:aliceSizes)
//             {
//                 aliceSum=aliceSum+x;  // sum of alice
//             }
//             for(int x:bobSizes)
//             {
//                 bobSum=bobSum+x;  // sum of bob
//                 bCandy.add(x);// add all elements of bob in hashmap
//             }

//             int diff=(bobSum-aliceSum)/2;
            
//             for(int x:aliceSizes)
//             {
//                 if(bCandy.contains(x+diff))  // for every element of alicearray check this 
//                 {
//                     ans[0]=x;
//                     ans[1]=x+diff;
//                     break;
//                 }
//             }
//             return ans;
//         }
        
  
// }
