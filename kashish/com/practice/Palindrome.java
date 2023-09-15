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
    public static boolean isPalindromeCharArray(char[] ch){
      int start, end;
      start = 0;
      end = ch.length - 1;
      while(start < end){
           if(ch[start] != ch[end]){
            return false;
           }
           start++;
           end--;
      }
      return true;
    }
    public static void main(String args[]) {

      // System.out.println(isPalindrome("ama"));
      System.out.println(isPalindromeCharArray(new char[]{'a','b','c','b','a'}));
      System.out.println(isPalindromeCharArray(new char[]{'a','b','b','a'}));
      System.out.println(isPalindromeCharArray(new char[]{'m','b','c','b','a'}));
     
    }
}