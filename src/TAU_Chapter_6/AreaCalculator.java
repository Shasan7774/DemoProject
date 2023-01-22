package TAU_Chapter_6;
//6b
public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Instance of Rectangle Class
		
		
		//Rectangle 1
		Rectangle area1 = new Rectangle();
		area1.setLength(50);
		area1.setWidth(40);
		
		double areaOne = area1.calculateArea();
		//Rectangle 2
		Rectangle area2 = new Rectangle(50,60);
		double areaTwo = area2.calculateArea();
		double totalArea = areaOne + areaTwo;
		
		System.out.println("Area of the Rectangle one is:" +areaOne);
		System.out.println("Area of the Rectangle two is:" +areaTwo);
		System.out.println("Area of the total area is:" + totalArea);
		

	}

}
