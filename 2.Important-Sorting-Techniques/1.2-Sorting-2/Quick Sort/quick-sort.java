class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pindex = partition(arr, low, high);
            quickSort(arr, low, pindex - 1);
            quickSort(arr, pindex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low;
        int j = high - 1;

        while (i <= j){
            while (i <= j && arr[i] <= pivot){
                i++;
            }
            while (i <= j && arr[j] > pivot){
                j--;
            }
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}