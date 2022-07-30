package Two_Sum_2_Sorted_Array;

public class two_sum_2 {
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end=numbers.length-1;
        
        while(start<end)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else{
                return new int[]{start+1,end+1}; // + 1 because indexing is starting from 1
            }
        }
        
      return new int[]{}; // if nothing found then return empty array
    }
}

