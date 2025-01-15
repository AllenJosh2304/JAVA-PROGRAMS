/*
Given an array nums of integers, return how many of them contain an even
number of digits.
        Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits

 */
public class ArrayDigits {
    public static void main(String[] args) {
            int [] nums = {12,345,2,6,7896} ;
            int result = CountDigits(nums);
        System.out.println("The no.of even digits in the given array is "+ result);

    }
    //  to count the no.of digitd in the array
    static int CountDigits(int [] arr){
        int [] countarr = new int [arr.length];
        int count  = 0;
        for(int i = 0; i<arr.length; i++){
            int a = arr[i];
            while(a!=0){
                a/=10;
                count++;
        } countarr[i] = count;
        }
        return Digits(countarr)  ;
    }
   // to check the no.of even digits from the array given from the above function
    static int Digits(int [] countarr){
        int digicount = 0;
        for(int i = 0; i< countarr.length;i++){
            if (countarr[i] % 2 == 0){
                digicount++;
            }
        }
        return digicount;
    }


}
// chat gpt approach for efficiecy and effective program
/*
static int countEvenDigits(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            int digitCount = 0;
            while (num != 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
 */
