import java.util.Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
          int [] nums  = {2,7,11,15};
          int target  = 26;
          int [] result = Add(nums,target);
          if(result == null){
              System.out.println("target not found");
          }
        System.out.println(Arrays.toString(result));

    }

    static int[] Add(int [] arr, int num){

        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i] + arr[j] == num){
                    int [] index = {i,j};
                    return index ;
                }
            }
        } return null;
    }
}


