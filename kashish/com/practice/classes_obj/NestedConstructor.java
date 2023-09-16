package kashish.com.practice.classes_obj;

public class NestedConstructor {

    static int val = 0;

    NestedConstructor(){
      
        //this(0);
        System.out.println("in default");
       
    }

   NestedConstructor(int val){
      
        this();
        System.out.println("in parameterized");
        // this(); error
    }

     void check(){
     
      System.err.println("Hii");
      if(val == 0){
        val++;
        this.check();
      }
      System.err.println("Hii22");
      
    }

    public static void main(String args[]){
        //creating objects
        NestedConstructor c1=new NestedConstructor(0);
        c1.check();
   
    }
    
}
