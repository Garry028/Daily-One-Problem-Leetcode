package Sqrt;

public class Sqrt {
    public static void main(String[] args) {
        

    }
    public int mySqrt(int x) {
        
          
        int start=1; // start is 1 unitl the element
        int end = x;
      /*   ex-> 8
           range is 1 2 3 4 5 6 7 8 
           apply the binary search here
      */
        while(start<=end)
        {
           int mid = start + (end-start)/2;
           if((long)mid*mid==(long)x)// type conversion is requirred here
           {
               return mid;
           }
           else if((long)mid*mid>(long)x)
           {
                end=mid-1;
           }
            else if((long)mid*mid<(long)x)
            {
             start=mid+1;   
            }
            
        }
        // return start-1;
        return end;
    }
}