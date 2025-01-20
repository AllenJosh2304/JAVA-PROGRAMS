class Solution {
    public static int missingNumber(int[] a, int n) {
        int sum_n = n * (n + 1) / 2;   // important formula
        int sum_a = 0;
        for (int num : a) {
            sum_a += num;
        }
        return sum_n - sum_a;
    }
}
class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int n = 5;
        Solution sol = new Solution();
        int result = sol.missingNumber(a, n);
        System.out.println(result);
    }
}
