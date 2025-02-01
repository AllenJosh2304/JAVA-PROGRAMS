import java.util.Scanner;
public class LCMof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();
        // to find the numbers in descending order
        int a = Math.max(num1, Math.max(num2, num3));
        int c = Math.min(num1, Math.min(num2, num3));
        int b = (num1 + num2 + num3) - (a + c);

        int result = find(a,b,c);
        System.out.println("The LCM of the given numbers: " + result);
    }
    static int find(int a,int b,int c){
        // logic for finding out the LCM of three numbers
        for(int i = 1; i<a*b*c ; i++){
            int num = i*a;   // 'a' should be greatest of three numbers
            if(num % b == 0 && num % c == 0){
                return num;
            }
        }
        return a*b*c;
    }

}
