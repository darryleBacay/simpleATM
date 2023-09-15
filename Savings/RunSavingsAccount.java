package Savings;

import java.util.Scanner;

public class RunSavingsAccount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SavingsAccount savings = new SavingsAccount();

    String border =
      "<------------------------------------------------------------------------>";

    System.out.println(border);
    do {
      System.out.println("Welcome to BDO");
      System.out.print("Enter interest rate: ");
      savings.setInterest(sc.nextDouble());
      System.out.print("Enter amount you want to deposit: ");
      savings.deposit(sc.nextDouble());
      savings.showBalance(savings);

      System.out.println(border);
      System.out.println("Do you want to do another transaction?");
      System.out.println("Type " + "y " + "to say Yes " + "N " + "to say No.");
      String chooseNewTransaction = sc.next();

      if (chooseNewTransaction.equalsIgnoreCase("Y")) {
        System.out.println("Press D to Deposit | Press W to withdraw");
        String choiceTransaction = sc.next();

        if (choiceTransaction.equalsIgnoreCase("D")) {
          System.out.print("Enter amount you want to deposit: ");
          double depositInput = sc.nextDouble();
          savings.deposit(depositInput);

          if (savings.getBalance() > 1000) {
            savings.addInterest(depositInput);
          }
          savings.showBalance(savings);
        } else if (choiceTransaction.equalsIgnoreCase("W")) {
          System.out.print("Enter amount you want to withdraw: ");
          System.out.println(
            "Yout new balance is : " + savings.withDraw(sc.nextDouble())
          );
        }
      } else {
        System.out.println("Thank you for using BDO.");
        break;
      }
      System.out.println(border);
    } while (true);
  }
}
