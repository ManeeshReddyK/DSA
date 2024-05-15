//Ceiling of a given number (smallest element in array greater than or equal to target)

public class Q1{
    public static void main(String[] args){
        int[] arr = {-18,-12,-8,0,11,24,35,46,58};
        int target = 25;
        int ans = ceilOfNumber(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return start if it does not exist
    static int ceilOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return arr[mid];
            }
        }
        //Note: Important to understand the below comment
        // end  target start 
        // (when while loop breaks start = end + 1 it indicates no target is found and next big number will become start) 
        return arr[start];
    }
}