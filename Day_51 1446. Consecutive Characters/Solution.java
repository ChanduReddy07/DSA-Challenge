class Solution {
    public int maxPower(String s) {
        char current=s.charAt(0);
        int max=1;
        int count=1;
        for(int i=1;i<s.length();i++){
            if(current==(char)s.charAt(i)){
                count++;
            }else{
                current=s.charAt(i);
                count=1;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
