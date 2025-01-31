/*A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding
the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.
Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
        1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:
Input: num = 7
Output: false*/
public class PerfectNumber {
    public static void main(String[] args) {
        int num =2;
        boolean result = isPerfect(num);
        System.out.println(result);
    }
    public static boolean isPerfect(int n) {
        if(n<1) return false;
        if(n == 1)
            return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}

