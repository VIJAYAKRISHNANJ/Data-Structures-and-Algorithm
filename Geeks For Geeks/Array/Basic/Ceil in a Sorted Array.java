

class Solution {
    public static void main(String[] args) {
        int arr[] = {1,1,4,4,4,4,10};
        int x = 4;
        int ans = findCeil(arr,x);
        System.out.println(ans);
    }
    static int findCeil(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                res = mid;        // Possible ceiling
                end = mid - 1;    // Search left for first occurrence
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
