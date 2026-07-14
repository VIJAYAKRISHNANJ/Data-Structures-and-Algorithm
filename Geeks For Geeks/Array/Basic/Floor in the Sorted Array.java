class Solution {
    
    public static void main(String[] args){
        int arr[] = {1,2,8,10,10,12,19};
        int x = 5;
        int ans = findFloor(arr,x);
        System.out.println(ans);
        
    }
    
    static int findFloor(int[] arr, int x) {
    
        int start = 0;
        int end = arr.length-1;
        int res = - 1;
        
        while(start <= end){
            
            int mid = (start + end)/2;
            
            if(arr[mid] > x){
                end = mid -1;
            }
            else{
                res = mid;
                start = mid + 1;
                
            }
        }   
        return res;
        
    }
}
