package Search_In_Rotated_Sorted_Array;

public class Rotated_Array_Search
{
  public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    System.out.print("Pivot is at index "+ findPivot(arr));
  }

  public int search(int [] nums,int target)
  {
    int pivot=findPivot(nums);
    // if no pivot  is found, then the array is not rotated
    if(pivot==-1)
   //just do normal binary search
   {
        return binary_search(nums,target,0,nums.length-1);
   }
   // if pivot is found, you have found 2 asc sorted arrays, one before pivot and one after pivot
   if(nums[pivot]==target)
   {
     return pivot;
   }
    // if target is less than pivot, then search in the first array
    if(target>=nums[0])
    {
      return binary_search(nums,target,0,pivot-1);
    }
    else
    {
    return binary_search(nums,target,pivot+1,nums.length-1);
    }
  }

    
   
 

  static int binary_search(int[] arr,int target,int start,int end)
  {

    while(start<=end)
    {
        

        int mid = start + (end-start)/2;// this is better way to find the mid

        if(target<arr[mid])//lies in the left of mid
        {
           end=mid-1;
        }
        else if(target>arr[mid])// lies in the right of the mid
        {
            start=mid+1;
        }
        else// found element
        {
            System.out.print("Element found at index: ");
            return mid;
        }
        
    }

    
     return -1;
}
  
  static int findPivot(int[] arr)
  {
    int start=0;
    int end=arr.length-1;

    while(start<=end)
    {
        int mid= start + (end-start)/2;
        // 4 cases over here
        if(mid<end && arr[mid]>arr[mid+1]) // mid should be less tha end beacause for avoiding arrayoutofbounds exception
        {
            return mid;
        }
        else if( mid>start && arr[mid]<arr[mid-1]) // mid should be greater than start beacause for avoiding arrayoutofbounds exception
        {
            return mid-1;
        }
        else if(arr[mid]<=arr[start])
        {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
  }


 }
