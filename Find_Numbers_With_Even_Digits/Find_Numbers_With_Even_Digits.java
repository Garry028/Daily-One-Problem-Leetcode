package Find_Numbers_With_Even_Digits;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// nums = [12,345,2,6,7896]
public class Find_Numbers_With_Even_Digits {
    public static void main(String[] args) {
       int[] arr={12,3435,23,63,7896};
        //   System.out.println(digits(991));
        System.out.println(findNumbers(arr));
    }

    static int findNumbers( int[] numss) {
     int counter=0;
     for(int num:numss)
     {
        if(even(num))//if number is even then increase the counter
        {
            counter++;
        }
     }
     return counter;
    }

    // this will check wheather the number is even or not
    static boolean even(int num1)
    {
       int number=digits(num1);

       if(number%2==0)
       {
        return true;
       }
       else
       {
        return false;
       }
    }

    // this will count the total digits
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
