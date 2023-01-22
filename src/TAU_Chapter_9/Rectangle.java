package TAU_Chapter_9;

public class Rectangle {
	protected double length;
	protected double width;
	protected double sides =4;
	
	public double getLength() {
		return length;
	}
	public void  setLentgh(double length) {
		this.length = length;
		
	}
	
	public double getWidht() {
		return width;
	}
	public void  setWidth(double width) {
		this.width = width;
		
	}
	
	public double getSdies() {
		return sides;
	}
	public void  setSides(double sides) {
		this.sides = sides;
		
	}
	
	public double calculatePerimeter() {
		return (2*length)+(2*width);
		
	}
	

}
