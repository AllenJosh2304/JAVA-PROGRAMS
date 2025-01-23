import java.util.Scanner;
public class AgeClassification {
    public static void main(String[] args) {
        System.out.println("Enter the Age : ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=12) System.out.println("Child");
        else if (n<=19) System.out.println("Teenager");
        else if (n<=64 ) System.out.println("Adult");
        else System.out.println("Senior");


    }
}
