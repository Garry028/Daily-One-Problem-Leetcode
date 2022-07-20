package Peak_Index_In_Mountain_Array;

public class peak {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2};
        int peak=Peak_Index_In_Mountain_Array(arr);
        System.out.println(peak);
    }
    static int Peak_Index_In_Mountain_Array(int[]nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])// this may be the ans but look at the left,you are in descending part
            {
                end=mid;
            }
            else{// this may be the ans but look at the right,you are in ascending part
                start=mid+1;
            }
        }
        // when the start is equal to end,it means you have found the ans
        return start; // here we can return start or end beacause both are same

    }
}
