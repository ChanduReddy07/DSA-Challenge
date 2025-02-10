class Solution {
    public double average(int[] salary) {
        long sum=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i:salary){
            min=Math.min(min,i);
            max=Math.max(max,i);
            sum+=i;

        }
        sum=sum-min-max;
        return (double)sum/(salary.length-2);
    }
}