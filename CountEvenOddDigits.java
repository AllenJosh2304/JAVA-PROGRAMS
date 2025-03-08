public class CountEvenOddDigits {
    public static void main(String[] args) {
        int a  = 23436,  odd = 0;
        int len = (a+"").length();
        while(a!=0){
            if(a%2!=0)
                odd++;
            a/=10;
        }
        System.out.println("odd numbers: "+ odd);
        System.out.println("even numbers: " + (len-odd));
    }
}
