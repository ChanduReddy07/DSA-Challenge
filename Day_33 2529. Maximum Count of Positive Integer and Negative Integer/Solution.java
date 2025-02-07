class Solution {
    public int maximumCount(int[] nums) {
        int pve=nums.length,nve=-1;
        int start=0,end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<0){
                nve=mid;
                start=mid+1;
            }else end=mid-1;
        }

        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>0){
                pve=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return Math.max(nums.length-pve,nve+1);

        // Brute force O(n) time complexity
        // int pve=0,nve=0;
        // for(int i:nums){
        //     if(i>0){
        //         pve++;
        //     }else if(i<0) nve++;
        // }
        // return Math.max(pve,nve);
    }
}