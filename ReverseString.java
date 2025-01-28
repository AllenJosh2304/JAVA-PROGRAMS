public class ReverseString {
    public static void main(String[] args) {
        String input = "HelloWorld!";
//        StringBuffer sb = new StringBuffer(input);
//        String reversed = sb.reverse().toString();
        for(int i = input.length() -1; i>=0 ;i--) {
            System.out.print(input.charAt(i));
        }

       // System.out.println("Reversed String: " + reversed);
    }
}
