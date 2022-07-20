package Ceiling_Problem;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
}

// when element not found then the while condition breaks.
// then senario is like ->  end - mid - start   means if we return start then we will get the element greater than target.


// for question of floor return end