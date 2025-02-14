import java.util.Scanner;

public class sumOfLastDigitsOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of Last Digits of 2 Numbers is :" + findSum(a,b));
    }
    static int findSum(int n1, int n2){
        int [] sum = new int[2];
        sum[0] = Math.abs(n1);
        sum[1] = Math.abs(n2);
        int result = 0;
        for(int i = 0;i<2; i++){
            result+=sum[i] % 10;
        }
        return result;
    }
}