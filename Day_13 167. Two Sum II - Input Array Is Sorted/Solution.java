class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] arr=new int[2];
        int l=0, r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
             if(sum==target){
                // arr[0]=l+1;
                // arr[1]=r+1;
                return new int[]{l+1,r+1};
             }else if(sum<target){
                l++;
             }else if(sum>target){
                r--;
             }
        }
        return new int[]{0};
    }
}