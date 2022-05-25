//28	Write a Java class as Savings Account with members as AccountNo and Balance. Provide depositAmount () and withdrawAmount () functions. If the user tries to withdraw more money than his balance, then throw a User Define Exception	
class InsufficientFundsException extends Exception{
	InsufficientFundsException(){
		super();
	}
	InsufficientFundsException(String message){
		super(message);
	}
}
class SavingsAccount{
	float accountNo = 0;
	float balance = 0;
	SavingsAccount(){
		accountNo = 0;
		balance = 0;
	}
	SavingsAccount(float _accountNo,float _balance){
		accountNo = _accountNo;
		balance = _balance;
	}
	void depositAmount(float deposit){
		balance += deposit;
		System.out.printf("Transaction: {+%.2f/%.2f}\n", deposit, balance);
	}
	void withdrawAmount(float withdraw) {
		try{
			balance -= withdraw;
			if (balance < 0){
				throw new InsufficientFundsException("Not enough funds to withdraw " + withdraw + " RS!");
			}
			System.out.printf("Transaction: {-%.2f/%.2f}\n", withdraw, balance);
		} 
		
		catch (InsufficientFundsException i){
			System.out.println(i);
			balance += withdraw;
			System.out.printf("Transaction: {-%f/%f}\n", 0.0, balance);
		}
	}
}
class P28{
	public static void main(String args[]){
		SavingsAccount s = new SavingsAccount(1, 100);
		s.depositAmount(20);
		s.withdrawAmount(1120);
	}
}