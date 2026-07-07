package LinearSearch;

public class MaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9},
                {10}
        };
        System.out.println(MaxVal(arr));
     

    }
    static int MaxVal(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > maxVal){
                    maxVal = arr[row][col];
                }
            }
            }
        return maxVal;
    }

    }
