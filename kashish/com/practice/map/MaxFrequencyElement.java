package kashish.com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElement {

    static int modeFrequencyTwo(int[] arr) {
        int mf = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.putIfAbsent(arr[i], 0);
            mp.put(arr[i], mp.get(arr[i]) + 1);
            if (mp.get(arr[i]) > mf)
                mf = mp.get(arr[i]);
        }
        return mf;

    }

    static int modeFrequency(int[] arr) {
       HashMap<Integer,Integer> mvp= new HashMap<>();
       for(int i:arr){
         if(mvp.containsKey(i)){
           mvp.put(i,mvp.get(i)+1);
         }
         else{
           mvp.put(i,1);
         }
       }
       int count=0;
       for(Map.Entry<Integer,Integer> fu: mvp.entrySet()){
         count = Math.max(count,fu.getValue());
       }
       return count;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 1 };
        assert (modeFrequency(arr) == 4) : "Expect 4 for arr = { 3, 3, 3, 3, 1 }";
        System.out.println("All test cases in main function passed");
    }

    
}
