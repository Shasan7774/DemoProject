package TAU_Chapter_7;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charArray[] = {'H','E','L','L','O','W','O','R','L','D'};
		char copyTo[] = new char[5];
		System.arraycopy(charArray, 5, copyTo, 0, 5);
		System.out.println(copyTo);
		
		int testInt[] = {10,20,30,40,50,60,70,80,90,100};
		/*
		 * testInt[0] = 10; testInt[1] = 15; testInt[2] = 20; testInt[3] = 25;
		 * testInt[4] = 30; testInt[5] = 35; testInt[6] = 40;
		 */
		
		int testCopy[]= new int[5];
		System.arraycopy(testInt, 2, testCopy, 0, 5);
		System.out.println("Test Copy Integer:"+testInt);
	}
	
}
