package kashish.com.practice.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoSortedArrays {
    //In this approach no hashset is used...
      public static List< Integer > sortedArray(int []a, int []b) {
       int len1 = a.length;
       int len2 = b.length;
       int pA, pB;
       pA = 0;
       pB = 0;
      
      // LinkedHashSet<Integer> set = new LinkedHashSet<>();
      List<Integer> res =  new ArrayList<Integer>();
     // res.add(a[pA]);
     
           if(a[pA] <= b[pB]){
           
             res.add(a[pA]);
               pA++;}else{
                   res.add(b[pB]);
               pB++; 
               }
              
               

       while(pA < len1 && pB < len2){
        
           if(a[pA] <= b[pB]){
               if(a[pA] != res.get(res.size() - 1))
                 res.add(a[pA]);
               pA++;
           }else{
               if(b[pB] != res.get(res.size() - 1))
                 res.add(b[pB]);
               pB++;
           }
       }

      // System.out.println(pA + " " + pB);

       if(pA < len1){
           for(int i = pA; i < len1; i++){
               if(a[i] != res.get(res.size() - 1))
                 res.add(a[i]);
           }
       }
       if(pB < len2){
            for(int i = pB; i < len2; i++){
                // System.out.println(b[i]);
               if(b[i] != res.get(res.size() - 1))
                 res.add(b[i]);
           }
       }
     

        return res;

    }
    
}
