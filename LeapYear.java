public class LeapYear {
    public static void main(String[] args) {
      int year = 1100;
        System.out.println(findYear(year));
    }
    static boolean findYear(int year){
        if(year % 100 == 0){
            if(year % 400 == 0){
                return true;
            }
            else return false;
        }
        else {
            if(year % 4 == 0) return true;
            else return false;
        }


    }


}
