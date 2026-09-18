class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        // int size = arr.length, i, j, t;
        
        // for(i=0; i<size; i++){
        //     for(j=0; j< size-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             t = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = t;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
