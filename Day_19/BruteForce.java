class BruteForce{
    public int maxAscendingSum(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            if(i!=nums.length-1 && nums[i]<nums[i+1]){
                sum+=nums[i];//30 
            }else{
                sum+=nums[i];//60
                l.add(sum);
                sum=0;
            }
        }
        sum=nums[0];
        System.out.println(l);
        for(Integer n:l){
            if(n>sum){
                sum=n;
            }
        }
        return sum;
    }
}

