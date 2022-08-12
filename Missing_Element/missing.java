package Missing_Element;

public class missing {

    public static void main(String[] args) {
        
        int []arr={3,0,1};
        int ans= missingNumber(arr);
        System.out.println(ans);

    }
    static int missingNumber(int[] nums) {
        int i=0;
        // in this que every element is at position same as index
        while(i<nums.length){

            int correct_index=nums[i];

            if(nums[i]<nums.length && nums[i]!=nums[correct_index])
            {
                int temp=nums[i]; 
                nums[i]=nums[correct_index];
                nums[correct_index]=temp;
            }
            else{
                i++;
            }
        }
        
        for(int index=0;index<nums.length;index++)
        {
            if( nums[index]!=index)
            {
                return index;         
            }
        }
        // when the element is already in correct order but nth element is missing then return nums.length
        // ex-> [0,1,2]  
        return nums.length;
    }
}