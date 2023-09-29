package kashish.com.practice.oops.constructors;

public class Main{

        public static void main(String[] args) {
            CopyConstructor original = new CopyConstructor(42);
    
            // Create a copy using the copy constructor-like method
            CopyConstructor copy = new CopyConstructor(original);
    
            System.out.println("Original: " + original.getValue() + " "+ original);
            System.out.println("Copy: " + copy.getValue()+ " "+ copy);
        }
    }
