import java.util.Scanner;

public class SumOfPowersOfDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        System.out.println("The result is :"+ findSum(num));
    }
    static int findSum(int n){
        String str = Integer.toString(n) ;
        int sum = 1;
        for(int i = 0 ;i<str.length()-1; i++){
            int a = Character.getNumericValue(str.charAt(i));
            int b = Character.getNumericValue(str.charAt(i+1));
            sum+=Math.pow(a,b);
        }
        return sum;
    }
}
