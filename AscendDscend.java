public class AscendDscend {
    public static void main(String[] args) {
        int num = 654321;
        boolean a = true, b =true;
        int cd =  num%10;
        while(num!=0){
            int pd = num%10;
            if(cd<pd)
                a = false;
            else if (cd>pd) {
                b = false;
            }
            cd= pd;
            num/=10;
        }
        if(a)
            System.out.println("Ascendong");
        else if (b) {
            System.out.println("Dscending");
        }
        else
            System.out.println("Not in order");
    }
}
