

public class orderAgnostics{
    public static void main(String[] args){
        int[] arr = {100000,9999,888,77,66,55,44,23,11};
        int target = 0;
        int ans = orderBS(arr,target);
        System.out.println(ans);

    }

    static int orderBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // sorted arrays is ascending or descending order
        boolean isascend;
        if(arr[start]<arr[end]){
            isascend = true;
        }else{
            isascend = false;
        }
        //if ascending order
        if (isascend){
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if(target == arr[mid]){ // common for the both ascending and descending order
                    return mid;
                }

                else  if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            }

            }else { // for the descending order
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if(target == arr[mid]){ // common for the both ascending and descending order
                        return mid;
                    }
                    if(target > arr[mid]){
                        end = mid-1;
                    }
                    else if(target <arr[mid]){
                        start = mid+1;
                    }
                }

            }return -1;


    }
}