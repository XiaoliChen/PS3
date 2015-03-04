package ps3;

public class InsufficientFundsException 
	{
	   private double amount;
	   
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
}
