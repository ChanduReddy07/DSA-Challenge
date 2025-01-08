package Day_3;

import java.util.HashMap;
import java.util.Map;

class GoodSolution {
    public static Map<Integer,Integer> map=new HashMap<>();
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        if(map.containsKey(n)) return map.get(n);
        int v=fib(n-1)+fib(n-2);
        map.put(n, v);
        return v; 
    }
}
