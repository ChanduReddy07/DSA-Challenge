package Day_1;

class GoodSolution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int l=str.length()-1;
        for(int i=0;i<=l;i++){
            if(str.charAt(i)!=str.charAt(l)){
                return false;
            }
            l--;
        }
        return true;
    }
}