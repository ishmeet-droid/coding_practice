package kashish.com.practice.oops.inheritance.creditcardexample;

public class AmazonCard extends CreditCard{
  private double amazonPayBalance;

  public AmazonCard(){
    // super();
    this(2);
    // this(2,3);
    
    System.out.println("Inside AmazonCard constructor1");
  }

    public AmazonCard(int a){
    
    this(2,3);
      //super...
    // super();
    System.out.println("Inside AmazonCard constructor2");
  }
   public AmazonCard(int a, int b){
    
    super();
    System.out.println("Inside AmazonCard constructor3");
  }

  // cc() -> a3() -> a2() -> a1()

  























  
  
  // public void redeemAmazonPayBalance(){
  //   System.out.println("Inside AmazonCard : redeemAmazonPayBalance()");
  // }
}