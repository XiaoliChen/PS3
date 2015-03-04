package ps3;
import java.util.*;

public class Account {
 
//define variables
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
// no arg construto
 public Account (){
		id =0;
		balance =0.0;
		annualInterestRate=0.0;
		dateCreated = new Date();
	}
//constructor with specified id and initial balance
public Account(int newId, double newBalance){
	id=newId;
	balance = newBalance;
	}
//to be able to set new annual interest rate in the following steps
public Account(int newId, double newBalance, double newAnnualInterestRate) {
    id = newId;
    balance = newBalance;
    annualInterestRate = newAnnualInterestRate;
}
//accessor and mutator method of id, balance and annualInterestRate
//ID
	public int getId(){
		return id;
	}
	public void setId(int newId){
		id=newId;
	}
//BALANCE
	public double getBalance(){
		return balance;
	}	
	public void setBalance(double newBalance){
		balance=newBalance;
	}
//annual interest rate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double newInterestRate){
		annualInterestRate=newInterestRate;
	}
//the accessor method for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreate(Date newDateCreated){
		dateCreated=newDateCreated;
	}
//define method getMonthlyInterestRate
	double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
//define method withdraw
	double withdraw(double amount){
		return balance=balance-amount;
		}
//define method deposit
	double deposit(double amount){
		return balance=balance+amount;
	}
}
