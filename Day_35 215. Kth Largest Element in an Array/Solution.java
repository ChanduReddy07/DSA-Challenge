class Solution {
    public int findKthLargest(int[] nums, int k) {

    //    #1  
    //    Arrays.sort(nums);
    //    return nums[nums.length-k];
    
    //    #2
       PriorityQueue<Integer> pq = new PriorityQueue<>(); 
       for(int i=0;i<nums.length;i++){

           if(pq.size()<k){
               pq.add(nums[i]);
           }else if ( pq.peek()<nums[i]){
               pq.remove(); // Remove the smallest element from the heap (the root of the min-heap)
               pq.add(nums[i]);
           }
       }

       return pq.peek(); // Return the smallest element from the heap, which is the k-th largest overall
    }
}
