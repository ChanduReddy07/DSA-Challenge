import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int p=num.length-1;
        int carry=0;
        List<Integer> l=new ArrayList<>();
        while(p>=0 || k>0){
            int val=0;
            if(p>=0) val=num[p];

            int d=k%10; // last digit from k
            k=k/10;  //removing last digit from k

            int sum= val + d +carry;  //arr value+last digit from k+carry
            l.add(sum%10); //if sum is>9 then we add last dight from sum ,else sum value
            carry=sum/10; //if >10 carry =1 or 2..... ,else 0
            p--; //array pointer degrement 
        }
        if(carry>0){
            l.add(carry);
        }
        Collections.reverse(l);
        
        return l;
    }
}