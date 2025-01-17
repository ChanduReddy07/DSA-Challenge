public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        int idx = n-1;
        int f = 0, l = n-1;
        while(f<=l){
            if(nums[f]>nums[l]){
            ans[idx--]=nums[f++];
            }else{
                ans[idx--]=nums[l--];
            }
        }
        return ans;
    }
}