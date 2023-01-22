package TAU_Chapter_7;

public class Array_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int marks[] = new int[5]; marks[0] = 100; marks[1] = 101; marks[2] = 102;
		 * marks[3] = 103; marks[4] = 200;
		 */
		int marks[] = { 100, 200, 300, 400, 500 };
		/*
		 * for (int i =0; i<marks.length; i++) {
		 * 
		 * System.out.println("Marks:" + marks[i]);
		 * 
		 * //print if the value is greater than 100 if (marks[i] > 100) {
		 * System.out.println("Marks Greater than 100:" + marks[i]);
		 * 
		 * }
		 */
		for (int item : marks) {
			System.out.println(item);
			
		}

	}

}
