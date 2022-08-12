package First_missing_positive;

public class fmp {
    public static void main(String[] args) {

    }

   
        public int firstMissingPositive(int[] nums) {
            int i=0;
            // in this que every element is at position same as index
            while(i<nums.length){
    
                int correct_index=nums[i]-1;
    
                if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct_index])// -ve are ignored
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
                if( nums[index]!=index+1)
                {
                    return index+1;         
                }
            }
            // when array is like [1,2,3,4] then ans is n+1 means 5 , n is length of array
            return nums.length+1 ;
        
        }
    }
