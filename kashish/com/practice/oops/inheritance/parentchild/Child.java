package kashish.com.practice.oops.inheritance.parentchild;

public class Child extends Parent {

    int price = 15;
     
    public int getPrice(){
     return price += 3;
     }

    public char getChar(){
        return 'a';
    }

     public static void main(String[] args){

        Parent p = new Child();
        Child c = (Child) p;

        System.out.println(p.price);
        System.out.println(p.getPrice());
        // System.out.println(p.getChar()); --> error 
        System.out.println(c.price);
        System.out.println(c.getPrice());
        System.out.println(c.getString());


     }

    
}
