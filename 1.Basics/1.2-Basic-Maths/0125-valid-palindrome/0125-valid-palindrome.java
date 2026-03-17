class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int r = str.length() - 1;
        int l = 0;
        return helper(str,l,r);
    }

    public boolean helper(String s, int l, int r){
        if (l >= r ){
            return true;
        }if (s.charAt(l) != s.charAt(r)) {
            return false;
        }return helper(s,l+1,r-1);
    }
}




