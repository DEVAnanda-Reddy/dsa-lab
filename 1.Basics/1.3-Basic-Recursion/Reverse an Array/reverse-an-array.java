class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length - 1;
        int i = 0;
        helper(arr,i,n);
    }
        
    public void helper(int arr[],int i ,int n) {
        if (i < n){
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        helper(arr,i+1,n-1);
        }
    }
}