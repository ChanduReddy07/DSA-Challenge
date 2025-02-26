class Solution {
    public int findLucky(int[] arr) {
        int[] nums=new int[501];
        int count=0;
        for(int i:arr){
            nums[i]++;
        }
        for(int j=500;j>0;j--){
            if(nums[j]==j){
                return j;
            }
        }
        return -1;
    }
}