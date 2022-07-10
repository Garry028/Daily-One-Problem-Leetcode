package Find_Numbers_With_Even_Digits;

public class Shortcut_method {
    public static void main(String[] args) {
        System.out.println(digits(1344));
    }
    static int digits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}



// this is another shortcut
// class Solution {
//     public int findNumbers(int[] nums) {
//         int ret = 0;
//         for(int num : nums) {
//             if (((int) (Math.log10(num) + 1)) % 2 == 0) {
//                 ret++;
//             }
//         }
//         return ret;
//     }
// }