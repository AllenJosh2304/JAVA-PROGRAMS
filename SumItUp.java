public class SumItUp {
    public static void main(String[] args) {
        int a = 123456,b=0;
        while(a!=0){
          b+=a%10;
          if(b>9)
              b-=9;
          a/=10;
        }
        System.out.println(b);
    }
}
