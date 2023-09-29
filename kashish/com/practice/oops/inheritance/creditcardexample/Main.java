package kashish.com.practice.oops.inheritance.creditcardexample;

class Main {
  public static void main(String[] args) {
    CreditCard cc = new CreditCard();   
    System.out.println();
    AmazonCard ac = new AmazonCard();
    System.out.println();
    CreditCard ac2= new AmazonCard(2);
    System.out.println();
    CreditCard ac3= new AmazonCard();
  //  AmazonCard ac4= new CreditCard(); --> error incompatible














    
    // ac.generateBill();
    // ac.pay();
    // ac.redeemAmazonPayBalance();
    // // below call will throw an error
    // //  ac.calculateTotalDues();  
    // System.out.println();
    // FlipkartCard fc = new FlipkartCard();
    // fc.generateBill();
    // fc.pay();
    // // below call will throw an error
    // //  fc.calculateTotalDues();  
    // fc.redeemSuperCoins();
  }
}