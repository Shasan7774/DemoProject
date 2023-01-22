package TAU_Chapter_6;
//6a
public class Rectangle {

	double length;
	double width;
	
	//Default Constructor
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width) {
		/*
		 * this.length= length; 
		 * this.width = width;
		*/
		setLength(length);
		setWidth(width);
		
	}
	
	double getLength() {
		return length;
	}
	void setLength(double length) {
		this.length = length;
	}
	double getWidth() {
		return width;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	double calculatePerimeter() {
		return (2*length)+(2*width);
	}
	double calculateArea() {
		return length * width;
	}

}
