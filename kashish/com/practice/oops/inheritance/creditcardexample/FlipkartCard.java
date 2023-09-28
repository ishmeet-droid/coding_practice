package kashish.com.practice.oops.inheritance.creditcardexample;

public class FlipkartCard extends CreditCard{
  private double SuperCoins;

  public FlipkartCard(){
    System.out.println("Inside FlipkartCard constructor");
  }
  
  public void redeemSuperCoins(){
    System.out.println("Inside FlipkarCard : redeemSuperCoins()");
  }
}