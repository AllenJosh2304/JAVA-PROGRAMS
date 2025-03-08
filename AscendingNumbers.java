public class AscendingNumbers {
    public static void main(String[] args) {
        int a = 132;
        while(a!=0){
            if(a%10 <= (a/10)%10)
                break;
            a/=10;
        }
        if(a==0)
            System.out.println("The no.is Ascending");
        else 
        System.out.println("The no.is not Ascending");
    }
}
