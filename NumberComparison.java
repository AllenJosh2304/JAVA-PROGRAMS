public class NumberComparison {
    public static void main(String[] args) {
      num(5,8);
      int result = mystnum(3,4);
      System.out.println(result);
    }
    static void num(int a, int b){
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <=b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
    static int mystnum(int a, int b) {
        return  a>b ? a : b;
    }
}
