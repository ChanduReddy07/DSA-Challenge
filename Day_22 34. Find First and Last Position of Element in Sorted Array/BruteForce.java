class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                flag=true;
                break;
            }
        }
        if(flag){
            for(int j=nums.length-1;j>=arr[0];j--){
                if(nums[j]==target){
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}