class Solution {
    public void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i> 0; i--){
            int isswaped = 0;
            
            for (int j =0; j < i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    isswaped = 1;
                    
                }
            }if (isswaped == 0){
                break;
            }
            
        }
        
    }
}