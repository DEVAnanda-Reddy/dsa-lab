class Solution {
    
    static void merge(int arr[], int l, int m, int r){
        int left = l;
        int right = m + 1;
        
        int temp[] = new int[r - l + 1];
        int k = 0;
        
        while(left <= m && right <= r){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        
        while(left <= m){
            temp[k++] = arr[left++];
        }
        
        while(right <= r){
            temp[k++] = arr[right++];
        }
        
        for(int i = l; i <= r; i++){
            arr[i] = temp[i - l];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;

        int m = (l + r) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}