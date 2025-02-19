package Day_6;

import java.util.HashMap;
import java.util.Map;

public class BestSolution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                // arr[0]=i;
                // arr[1]=map.get(target-nums[i]);
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
