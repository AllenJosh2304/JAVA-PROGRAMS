import java.util.Scanner;

public class NPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int num  = sc.nextInt();
        int result = Find(num);
        System.out.println(result);


    }

    public static int Find(int num){
        int count = 0;
        int number  = 1;

        while(count<num){
            number++;
            if(isPrime(number)){
                count++;
            }
        }
         return number;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

