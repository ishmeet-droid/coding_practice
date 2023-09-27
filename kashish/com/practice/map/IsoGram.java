package kashish.com.practice.map;

import java.util.HashSet;

public class IsoGram {
    
    public static boolean isogram(String s) {

       HashSet<Character> hs = new HashSet<>();
       for(int i=0;i<s.length();i++){
         if(hs.contains(s.charAt(i))){
           return false;
         }
         else{
           hs.add(s.charAt(i));
           
         }
       }
       return false;
    }

    public static void main(String args[]) {

      assert (isogram("aba") == false) : "Expect false for s = \"aba\"" ;
      System.out.println("All test cases in main function passed");

    }
    
}
