//Find the smallest letter greater than the target
//Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

public class SmallestLetter {
    public static void main(String[] args) {
       char [] letters = {'a','c','e','g','j','m','q','t'};   // the array shold be non-decreasing according to the ascii value
       char target = 'c';
       // to print the ascii value of aplabets
        // 'a' - 'z' >> 97 - 122
        //'A'  - 'Z' >> 65 - 90
        //System.out.println((int)target);
       System.out.println(FindLetter(letters,target));
    }
     static char FindLetter(char [] letters,char target ){
            for(char letter:letters) {
                if (letter > target) {   // compares the ascii value
                    return letter;
                }
            }
            return letters[0]; // if the letter is not found return the first value
      }

    }



