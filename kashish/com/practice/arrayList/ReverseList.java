package kashish.com.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    
    static List chessProdigy(int[] rating) {

           List<Integer> p = new ArrayList<>(); 
          int sum=0;
          for(int i=rating.length-1;i>=0;i--){
            if(rating[i]>sum)
            {
              p.add(rating[i]);
            }
            sum=sum+rating[i];
            
          }
          Collections.reverse(p);
          return p;
    }

    public static void main(String args[]) {

        assert Arrays.asList(27, 8, 3).equals(chessProdigy(new int[] { 16, 27, 1, 3, 8, 3 })) : "Expect {27, 8, 3} for array={16, 27, 1, 3, 8, 3}";
        System.out.println("All test cases in main function passed");

    }
    
}
