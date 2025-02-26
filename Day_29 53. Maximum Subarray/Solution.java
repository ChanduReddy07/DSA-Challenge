class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(sum<0) sum=0;
            sum+=i;
            if(sum>max) max=sum;
        }
        return max;
    }
}