class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }else{
            int min=Integer.MAX_VALUE;
            for(int i=nums.length-1;i>0;i--){
                if(min>nums[i]){
                    min=nums[i];
                }
                if(nums[i-1]>nums[i]) return min;
            }
        }
        return nums[0];
    }
}


// class Solution {
//     public int findMin(int[] nums) {
//         int left = 0, right = nums.length - 1;
//         while(left < right) {
//             int mid = left + (right - left) / 2;

//             if(nums[mid] < nums[right]) {
//                 right = mid;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return nums[left];
//     }
// }