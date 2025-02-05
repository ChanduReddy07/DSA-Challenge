class Solution {  
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        
        int tCount = 0, belowtCount = 0;
        for(int i:nums){
            if(i<target){
                belowtCount++;
            }else if(i==target){
                tCount++;
            }
        }
        while(tCount>0){
            list.add(belowtCount++);
            tCount--;
        }
        return list;
    }
}




