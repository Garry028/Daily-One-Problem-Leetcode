class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct_ind=nums[i]-1;
            
            if(nums[i]!=nums[correct_ind])
            {
             
                int temp=nums[i];
                nums[i]=nums[correct_ind];
                nums[correct_ind]=temp;
                
            }
            else{
                i++;
            }
        }
        
        for(int index=0;index<nums.length;index++) // duplicate number means number which has wrong index & missing element means index+1
        {
            if(nums[index]!=index+1)
            {
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}