public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}



// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i:nums){
//             if(map.containsKey(i)) return i;
//             map.put(i,1);
//         }
//         return 0;
//     }
// }