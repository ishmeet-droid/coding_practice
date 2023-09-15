package kashish.com.practice;
import java.util.*;

public class Palindrome{

    public static boolean isPalindrome(String s){
      String str= "";
      for(int i= s.length() - 1 ;i >= 0;i--){
        char ch = s.charAt(i);
        str = str+ (""+ch);
        
      }
      if(s.equals(str))
        return true;
      else 
        return false;
    }

    public static boolean isPalindrome(char[] ch){
      String s = new String(ch);
      String str= "";
     // String rev=s;
      for(int i= s.length() - 1 ;i >= 0;i--){
        char chr = s.charAt(i);
        str = str+ (""+chr);
        
      }
      if(s.equals(str))
        return true;
      else 
        return false;
    }

    public static void main(String args[]) {

      System.out.println(isPalindrome("ama"));
     
    }
}