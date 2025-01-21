class Solution {
    public int dominantIndex(int[] nums) {
        int flargest=-1;
        int slargest=-1;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>flargest){
                slargest=flargest;
                flargest=nums[i];
                idx=i;
            }else if(nums[i]>slargest){
                slargest=nums[i];
            }
        }
        if((slargest+slargest)<=flargest){
            return idx;
        }
        return -1;
    }
}