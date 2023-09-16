package kashish.com.practice;

public class StaticExample {
    

    static int count=0;//will get memory only once and retain its value

    StaticExample(){
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

     // static method
     static int cube(int x){
        return x*x*x;
    }


    public static void main(String args[]){
        //creating objects
      //count 0
        StaticExample c1=new StaticExample();
      //count 1
        StaticExample c2=new StaticExample();
      //count 2
        StaticExample c3=new StaticExample();

       int result= StaticExample.cube(5);

       System.out.println(result);

    }


}
