package kashish.com.practice.oops.inheritance.creditcardexample;
import java.util.Date;

public class CreditCard{
  double creditLimit;   // Accessible to all the subclasses
  Date expiryInfo;      // Accessible to all the subclasses
  public String owner;      // Accessible to all the subclasses
  private double rewardPoints;  // Not acccessible to any subclass / Not inherited

  public CreditCard(){
    System.out.println("Inside CreditCard constructor");
  }
  public CreditCard(int a){
    System.out.println("Inside CreditCard constructor2");
  }
  public void pay(){        // Accessible to all the subclasses
    System.out.println("Inside CreditCard : pay()");
  }  
  
  void redeemRewardPoints(){      // Accessible to all the subclasses
       System.out.println("Inside CreditCard : redeemRewardPoints()");
  } 
  void generateBill(){         // Accessible to all the subclass
   System.out.println("Inside CreditCard : generateBill()");
    calculateTotalDues();
  }
  
  private void calculateTotalDues(){ // Not acccessible to any subclass / Not inherited
  System.out.println("Inside CreditCard : calculateTotalDues()");
}
}