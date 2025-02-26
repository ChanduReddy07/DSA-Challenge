class Solution {
    public int findfirst(int[] nums, int target){
        int first = -1;
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (high + low) / 2;
            if(nums[mid] >= target){
                first = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return first;
    }
    public int findlast(int[] nums, int target){
        int last = -1;
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (high + low) / 2;
            if(nums[mid] <= target){
                last = mid;
                low = mid + 1;           
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int first = findfirst(nums, target);
        if(nums.length == 0 || first == -1 || nums[first] != target){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        ans[0] = first;
        ans[1] = findlast(nums, target);
        return ans;
    }
}