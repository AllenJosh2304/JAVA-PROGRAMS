public class AddAbsolute {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);
        int difference;
        if(a<b){
            difference = (a - b)*-1;
            System.out.println(difference);
        }
        else{
            difference = a - b;
            System.out.println(difference);
        }
    }
}
