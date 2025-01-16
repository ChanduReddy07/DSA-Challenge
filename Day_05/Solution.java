
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bottles=numBottles;
        int drink=numBottles;
        while(bottles>=numExchange){
            int n=bottles/numExchange;
            drink+=n;
            bottles=bottles-(numExchange*n)+n;
            //bottles=(bottles%numExchange)+n;
        }
        return drink;
    }
}