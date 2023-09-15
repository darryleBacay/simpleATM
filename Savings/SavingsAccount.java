package Savings;

public class SavingsAccount {

  private double balance;
  public static double interestRate;

  public static double setInterest(double newRate) {
    return interestRate = newRate;
  }

  public static double getInterestRate(double interestRate) {
    return interestRate;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public double withDraw(double amount) {
    if (balance >= amount) {
      return balance - amount;
    } else {
      return 0;
    }
  }

  public void addInterest(double interest) {
    interest = balance * interestRate;
    balance += interest;

    System.out.println("Your current balance is: " + balance);
  }

  public void showBalance(SavingsAccount account) {
    System.out.println("Your current balance is: " + account.getBalance());
  }
}
