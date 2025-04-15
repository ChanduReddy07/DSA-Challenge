class Solution {
    public int maxProfit(int[] prices) {
        int best=0;
        int point=prices[0];
        int idx=0;
        for(int i=1;i<prices.length;i++){
            if(point>prices[i]){
                point=prices[i];
            }
            int diff=prices[i]-point;
            if(best<diff){
                best=diff;
            }

        }
        return best;
    }
}