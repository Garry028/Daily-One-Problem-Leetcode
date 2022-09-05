package DuplicateNumber;

public class DuplicateNumber {
    public static void main(String[] args) {

    }
    // public int findDuplicate(int[] nums) {

    // //here we use the concept of turtle and rabbit, to make the problem more
    // intresting
    // //as we Know turtle moves slow(Here, By 1 step) and rabbit fast (by 2 steps),
    // keep this concept in mind and
    // // follow the same rule of linked list cycle detection

    // int turtle = nums[0]; //Both turtle and rabbit are at same location (on first
    // element of an array)
    // int rabbit = nums[0];
    // do{
    // turtle = nums[turtle]; //move turtle by one step
    // rabbit = nums[nums[rabbit]]; //move rabbit by two step
    // }while(turtle != rabbit); //It is a type of cycle if you do dry run, wherever
    // they meet, come out from the loop

    // rabbit = nums[0]; //now put any one of them at first element location
    // while(rabbit!=turtle){ //move both of them by one step until there value
    // becomes not equals to each other
    // turtle = nums[turtle]; //move both of them by one step
    // rabbit = nums[rabbit];
    // }

    // return turtle; //return any of them (because slow and steady wins the race.
    // So, here we return turtle).
    // }

    // using cyclic sort method
    public int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) // if not equal to then swap else we found the element
            {
                int correct_index = nums[i] - 1;

                if (nums[i] != nums[correct_index]) {
                    int temp = nums[i];
                    nums[i] = nums[correct_index];
                    nums[correct_index] = temp;
                }

                else {
                    // means we're ignoring the duplicate
                    return nums[i];// ans found
                }

            } else {
                i++;
            }
        }
        return -1;
    }

}
