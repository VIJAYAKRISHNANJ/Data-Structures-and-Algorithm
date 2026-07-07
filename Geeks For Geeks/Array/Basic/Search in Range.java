package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,6};
        System.out.println(minValue(arr));;
    }
    static int minValue(int[] arr){
        if (arr.length == 0){
            return -1;
        }

        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal){
                minVal = arr[i];
            }


        }
        return minVal;
    }
}
