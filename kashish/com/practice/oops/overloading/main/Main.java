package kashish.com.practice.oops.overloading.main;

public class Main {

    public static void main(int[] a){
        System.out.println("In overloaded int main");
    }
    public static void main(String args){
           System.out.println("In overloaded String main");
    }
    public static void main(String[] args, int a){
           System.out.println("In Int and String main");
    }
     public static void main( int a,String[] args){
           System.out.println("In Changed seqence of parameters");
    }

     public static void main(String[] args){
           System.out.println("In plain String main");
    }
    
}
