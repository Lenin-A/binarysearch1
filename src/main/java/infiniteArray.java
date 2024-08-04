public class infiniteArray {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170,180,190,200,210,220,230,240,250};
        int target = 100;
    int  ans = find(arr, target);
    System.out.println(ans);
        //consider the n infinte Array dont know the size of the arrays so the we not use array length
    }
    static int find(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newstart = end + 1;                        // size of the boxes * 2 -> size of the array = (end - start +1)
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr, int target, int start ,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target  > arr[mid]){
           start = mid+1;
            }
     else{
         return mid;
            }
        }
        return -1;
    }

}





