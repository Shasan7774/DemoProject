package TAU_Chapter_9;

public class AccountInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("Hasan Shariar", 17110521);
		OverDraftBankAccount o1 = new OverDraftBankAccount("Fahim, Shahriar", 15000001, 10000);
		b1.PrintSuperClassBankStatement();
		o1.PrintSubClassBankStatement();

	}

}
