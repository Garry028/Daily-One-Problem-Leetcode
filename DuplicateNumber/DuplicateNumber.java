package DuplicateNumber;

public class DuplicateNumber {
    public static void main(String[] args) {
        
    }
    public int findDuplicate(int[] nums) {
    
        //here we use the concept of turtle and rabbit, to make the problem more intresting
        //as we Know turtle moves slow(Here, By 1 step) and rabbit fast (by 2 steps), keep this concept in mind and
        // follow the same rule of linked list cycle detection, if you are not aware of it....dont worry!
        
        int turtle = nums[0];       //Both turtle and rabbit are at same location (on first element of an array)
        int rabbit = nums[0];
        do{
            turtle = nums[turtle];          //move turtle by one step
            rabbit = nums[nums[rabbit]];    //move rabbit by two step
        }while(turtle != rabbit);           //It is a type of cycle if you do dry run, wherever they meet, come out from the loop
        
        rabbit = nums[0];                   //now put any one of them at first element location
        while(rabbit!=turtle){              //move both of them by one step until there value becomes not equals to each other
            turtle = nums[turtle];          //move both of them by one step
            rabbit = nums[rabbit];
        }
        
        return turtle;                  //return any of them (because slow and steady wins the race. So, here we return turtle).
    }
}

