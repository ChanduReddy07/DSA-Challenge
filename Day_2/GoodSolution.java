package Day_2;

class GoodSolution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        int temp=n;
        while(temp>2){
            temp=temp/2;
            if(temp%2!=0){
                return false;
            }
        }
        if(temp==2){
            return true;
        }else{
            return false;
        }

    }
}
