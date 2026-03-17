class Solution {
    public int fib(int n) {
        if (n == 1){
            return 1;
        }if (n <=0){
            return 0;
        }
        return helper2(n-1) + helper2(n-2);
    }
    public int helper2(int n){
        if (n == 0){
            return 0;
        }if (n == 1){
            return 1;
        }else{
            return helper2(n-1) + helper2(n -2);
        }
    }      
        
}
