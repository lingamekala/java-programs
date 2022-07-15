/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/

 import java.util.Scanner;
class BankAccount 
{ 
  
 
  private long account_number;
  private float account_balance;
  public long getaccount_number()
  {
    return account_number;
  }
  public void setaccount_number(long account_number)
  {
    this.account_number=account_number;
  }
  public long getaccount_balance()
  {
    return account_balance;
  }
  public void setaccount_balance(float account_balance)
  {
    this.account_balance=account_balance;
  }
   
}  
 class ExpertHacker  
{ 

public static void main(String args[]) 
  { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Bankaccount Number :");
  long a=sc.nextLong();
  System.out.println("Enter Current Balance :");
  long a=sc.nextLong();
  BankAccount bc=new BankAccount();
  bc.set account_number(a);
  bc.set account_balance(b);
  System.out.println("BankAccount Number : "+bc.get account_number());
  System.out.println("Current Balance    : "+bc.get account_balance());
  }
}