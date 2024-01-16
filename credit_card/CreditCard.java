package credit_card;

public class CreditCard {
  private String account;
  private String bank;
  private String customer;
  private int limit;
  protected double balance;

  public CreditCard (String customer, String bank, String account, int limit, double balance) {
    this.account = account;
    this.bank = bank;
    this.customer = customer;
    this.limit = limit;
    this.balance = balance;
  }

  public CreditCard(String customer, String bank, String account, int limit) {
    this(customer, bank, account, limit, 0.0);
  }

  public String getAccount() { return account; }
  public String getCustomer() { return customer; }
  public String getBank() { return bank; }
  public int getLimit() { return limit; }
  public double getBalance() { return balance; }

  public boolean charge(double price) {
    if (price + balance > limit)
      return false;
    
    balance += price;
    return true;
  }

  public void makePayment(double amount ) {
    balance -= amount;
  }

  public static void printSummary (CreditCard card) {
    System.out.println("Customer = " + card.customer);
    System.out.println("Bank = " + card.bank);
    System.out.println("Account = " + card.account);
    System.out.println("Limit = " + card.limit);
    System.out.println("Balance = " + card.balance);
  }
}
