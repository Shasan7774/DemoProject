package TAU_Chapter_9;

public class BankAccount {
	protected String acHolderName;
	protected int accountNumber;
	private float balance;
	
	
	public BankAccount(String userName, int accNumber) {
		acHolderName = userName;
		accountNumber = accNumber;
		
	}
	
	public void PrintSuperClassBankStatement() {
		System.out.println("Bank Statement of Super Class:");
		System.out.println("Account Holder Name:" +acHolderName);
		System.out.println("Account Number:" +accountNumber);
		//System.out.println("Account Current Balance:" +balance);
		
	}


}
