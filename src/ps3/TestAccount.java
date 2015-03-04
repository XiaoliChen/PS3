package ps3;

public class TestAccount {
	public static void main(String[] args){
		Account account=new Account(1122,20000,4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("balance of id" +account.getId()+"is"+account.getBalance());
		System.out.println("Monthly Interest is"+account.getMonthlyInterestRate());
		System.out.println("this account is created at"+account.getDateCreated());
		
	}

}
