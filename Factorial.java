public class Factorial {
    public static void main(String[] args) {
       int n = 5;
       System.out.println(fact(n));
    }
    static int fact(int n){
        int ans = 1;
        if(n<=0) return -1;
        for(int  i = 1;i<=n;i++) {
            ans *= i ;
        }
        return ans;
    }
}

// recursive method
//static int fact(int n){
//    if (n <= 1) return 1;
//    return n * fact(n - 1);
//}
