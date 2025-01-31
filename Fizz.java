import java.util.Arrays;

public class Fizz {
    public static void main(String[] args) {
        int n =5;
        String[] answer = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                answer[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                answer[i - 1] = "Buzz";
            }
            else if (i % 15 == 0)  {
                    answer[i - 1] = "FizzBuzz";
            }
            else {
                answer[i - 1] = Integer.toString(i);
            }
            }
        System.out.println(Arrays.toString(answer));
        }

    }
