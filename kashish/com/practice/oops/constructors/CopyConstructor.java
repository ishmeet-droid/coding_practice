package kashish.com.practice.oops.constructors;

public class CopyConstructor {
    
        private int value;
    
        // Constructor
        public CopyConstructor(int value) {
            this.value = value;
        }
    
        // Copy constructor-like method
        public CopyConstructor(CopyConstructor other) {
            this.value = other.value;
        }
    
        public int getValue() {
            return value;
        }
    
        public void setValue(int value) {
            this.value = value;
        }
}
    

   

