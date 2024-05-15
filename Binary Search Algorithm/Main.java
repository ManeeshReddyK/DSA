public class Main
{
    public static void main(String[] args){
        int[] arr = {-18,-12,-8,0,11,24,35,46,58};
        int target = 24;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
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
                return mid;
            }
        }
        return -1;
    }

}