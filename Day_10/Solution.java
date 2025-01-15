class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum=(l*(l+1))/2;
        l--;
        int op=0;
        for(int i:nums){
            op=op+i;
            l--;
        }
        return sum-op;
    }
}