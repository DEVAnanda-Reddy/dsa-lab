class Solution {
    public int reverse(int x) {
        int lnum = 0;
        int rnum = 0;
            while (x != 0){
            lnum = x%10;
             if (rnum > Integer.MAX_VALUE/10 || rnum < Integer.MIN_VALUE/10){
                return 0;
             }
            rnum = (rnum*10) + lnum;
            x = x/10;
            }return rnum;


       

        
        
    }
}