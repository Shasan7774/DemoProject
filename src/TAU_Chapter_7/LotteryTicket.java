package TAU_Chapter_7;

import java.util.Random;

//7A-Lottery Ticket

public class LotteryTicket {
	private static final int LENGTH = 6;
	private static final int MAXNUMBER = 69;
	//Constant field and the naming convention of Constant is all Caps

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ticket = generateNumbers();
		printTicket(ticket);
		

	}
	public static int[] generateNumbers() {
		int[] ticket = new int[LENGTH];
		
		Random random = new Random();
		for (int i=0; i<LENGTH;i++) {
			ticket[i] = random.nextInt(MAXNUMBER) +1;
		}
		return ticket;
	}
	public static void printTicket(int ticket[]) {
		for (int i=0; i<LENGTH;i++) {
			System.out.print(ticket[i] + " | "); 
		}
		
	}
}
