public class AddDigit {
    public static void main(String[] args) {
        int num = 107;
        System.out.println(Digits(num));
    }
    static int Digits(int n){
        int sum = 0;
        while (n!=0){
            int a = n%10;
            sum+=a;  // adds Digits from the remainder
            n/=10;
        }
        if(sum>9){          // if the sum is double digit,the function calls itself
            return Digits(sum);
        }
        return sum;   // else the sum is returned
    }
}
