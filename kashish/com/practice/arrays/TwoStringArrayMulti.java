package kashish.com.practice.arrays;

import java.util.*;

public class TwoStringArrayMulti{

  

  private static int error = 0;

   public static String[] combineAllStrings(String[] s1, String[] s2) {
       String[] s3=  new String[s1.length*s2.length];
       int c =0;
       for(int i=0;i<s1.length;i++){
         for(int j=0;j<s2.length;j++){
           
           s3[c]=s1[i].concat(s2[j]);
           c++;
           
         }
         System.err.println(error);
       }
     return s3;
   
   
   }


    public static void main(String args[]) {

        String input1[] = {"a", "c", "e"};
        String input2[] = {"b", "d", "f"};
        String output[] = {"ab", "ad", "af", "cb", "cd", "cf", "eb", "ed", "ef"};
        assert Arrays.equals(combineAllStrings(input1, input2), output) : "Expect [\"ab\", \"ad\", \"af\", \"cb\", \"cd\", \"cf\", \"eb\", \"ed\", \"ef\"] for input1 = [\"a\", \"c\", \"e\"] and input2 = [\"b\", \"d\", \"f\"]";
        System.out.println("All test cases in main function passed");

    }
}

