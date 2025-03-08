public class SteppingNumber {
    public static void main(String[] args) {
        int a =1235;
        while(a!=0){
            if(Math.abs(a%10 - ((a/10)%10)) != 1)
                break;
            a/=10;
        }
        if(a==0)
            System.out.println("Is Stepping Number");
        else
            System.out.println("Not a Stepping Number");
    }
}
