    /*
       Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
     */
    public class Single {
        public static void main(String[] args) {
            int[] nums = {4, 1, 2, 1, 2};
            int result = singleNum(nums);
            System.out.println(result);
        }

        public static int singleNum(int[] nums) {
            int unique = 0;
            for (int num : nums) {
                unique ^= num;    //XOR operation cancels out the number if the number is appears twice
            }
            return unique;    // only the number appeared once is in  unique
        }
    }
