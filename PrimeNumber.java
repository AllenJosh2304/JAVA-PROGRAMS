import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number for checking prime number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean result = isPrime(n);
      System.out.println(result);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {            //logic for prime number
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

