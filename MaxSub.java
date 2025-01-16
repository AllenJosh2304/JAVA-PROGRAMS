/*
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
*/
public class MaxSub {
    public static void main(String[] args) {
        int[][] accounts =  {{1,5},{7,3},{3,5}};
        int result = Add(accounts);
        System.out.println(result);
    }
    static int Add(int [][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            int sum = 0;    // resets the the sum to zero after each iteration
            for (int j = 0;j<arr[i].length; j++){
                sum+= arr[i][j]; // asddition of the sub array
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
