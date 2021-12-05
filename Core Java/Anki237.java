import java.io.*;
class InsufficientFundsException extends Exception
{
private double amount;
public InsufficientFundsException(double amount)
{
this.amount=amount;
}
public double getamount()
{
return amount;
}
}
class CheckingAccount
{
private double balance;
private int num;
public CheckingAccount(int num)
{
this.num=num;
}
public void deposit(double amount)
{
	balance+=amount;
}
public void withdraw(double amount )throws InsufficientFundsException
{
if(amount<=balance)
{
balance-=amount;
}
else
{
double needs=amount-balance;
throw new InsufficientFundsException(needs);
}
}
public double getBalance()
{
return balance;
}
public int getnum()
{
return num;
}
}
public class Anki237
{
public static void main(String... s)
{
CheckingAccount c=new CheckingAccount(101);
System.out.println("depositing $500...");
c.deposit(500.00);
try
{
System.out.println("withdrawing $100...");
c.withdraw(100.00);
System.out.println("withdrawing $600...");
c.withdraw(600.00);
}
catch(InsufficientFundsException e)
{
System.out.println("SORRY but you are short $"+e.getamount());
e.printStackTrace();
}
}
}