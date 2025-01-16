public class BinarySearch {
    public static void main(String[] args) {
     int [] num = {-1,0,2,3,5,6,7,8,};
     int target = 4;
     int result = Search(num,target);
     System.out.println(result);
    }
    static int Search(int [] arr,int target){
        int start  = 0;
        int end = arr.length-1;
        boolean Ascending = arr[start]<arr[end];
        while(start<=end){
            int mid  = start + (end-start)/2; // '2,147,483,647' this is the largest value an integer can hold
            // if the array size is more than 50 crore which can never happen, in that case this will be helpful
            if (target == arr[mid]){
                return mid;
            }
            if(Ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        //return -1; this is for normal binary search
         return arr[start]; // this is for if the question is asking for ceiling number
    }
}