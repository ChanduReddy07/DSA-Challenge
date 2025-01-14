class Solution {
    public int maxProduct(int[] nums) {
        int fmax=-1;
        int smax=-1;
        for(int i:nums){
            if(fmax<i){
                smax=fmax;
                fmax=i;
            }else if(smax<i){
                smax=i;
            }
        }
        return (fmax-1)*(smax-1);
    }
}