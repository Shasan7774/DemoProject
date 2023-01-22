package TAU_Chapter_9;

public class OverDraftBankAccount extends BankAccount {
	//public String userName;
	//public int accNumber;
	public int limit;
	public OverDraftBankAccount(String userName, int accNumber, int transLimit) {
		super(userName, accNumber);
		limit = transLimit;
		
		
	}
	public void PrintSubClassBankStatement() {
		System.out.println("\n");
		System.out.println("Bank Statement of Sub Class:");
		System.out.println("Account User Name:" +acHolderName);
		System.out.println("Account Number:" +accountNumber);
		System.out.println("Account Transaction Limit:" +limit);
		
		
	}
}
