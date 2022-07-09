package TwoSum;

import java.util.*;

class TwoSum
{
    public static void main(String[] args) {
        
    }

    public int[] Twosum(int[] numbers,int target)
    {
      int[] result= new int[2];// this array contains the requirred indices

      Map<Integer,Integer> map=new HashMap<Integer,Integer>();//initialization of hashmap
      
      for (int i = 0; i < numbers.length; i++) {
        
        if (map.containsKey(target-numbers[i])) {

            result[0]=map.get(target-numbers[i]);
            result[1]=i;
            return result;
        }
        map.put(numbers[i], i);
      }
      return result;
    }
}

/*
 first of all check target-numbers[i] contains in HashMap or not,
 if not contains then store the current element and the index in the HashMap,
 likewise check for whole array,
 if HashMap contains the target-numbers[i] then requirred ans will be index of the current element in array and the element & index from HashMap
 */