package kashish.com.practice.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharcactersOfStringsFrquencyToEqual {
    static Boolean balancedToken2(String name) {

    if(name == "" || name.isEmpty())
      return true;

    name = name.toLowerCase();
    Map<Character,Integer> freqMap = new HashMap<>();
    for(char c : name.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }

    Set<Integer> values = new HashSet(freqMap.values());
    boolean isBalanced = values.size() == 1;

    return isBalanced;
  }



     static Boolean balancedToken(String name) {
      if(name.isEmpty()){
        return true;
      }
      name = name.toLowerCase();
      HashMap<Character,Integer> hs = new HashMap<>();
       for(int i=0;i<name.length();i++){
         if(hs.containsKey(name.charAt(i))){
           hs.put(name.charAt(i),hs.get(name.charAt(i))+1);  
         }
         else{
           hs.put(name.charAt(i),1);
         }
       }
       HashSet<Integer> h = new HashSet<>();
       
       for(Map.Entry<Character,Integer> mp : hs.entrySet()){
         h.add(mp.getValue());
         
       }
       if(h.size()==1){
         return true;
       }

      return false;

  }

  public static void main(String args[]) {
    assert balancedToken("Dererd") == true : "Expect true for input =\"Dererd\"";
    System.out.println("All test cases in main function passed");
  }
    
}
