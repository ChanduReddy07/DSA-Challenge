class Solution {
    public boolean isPalindrome(String s) {
        // s.toLowerCase();
        // System.out.print(s.toLowerCase());
        String str=s.toLowerCase();
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            char left=str.charAt(l);
            char right=str.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
            }else if(!Character.isLetterOrDigit(right)){
                r--;
            }else if(left!=right){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}