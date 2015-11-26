/*Calculate the area of square and rectangles using constructor overloading*/

package oops2;

class Shape{
	
	int area;

	public int getArea() {
		return area;
	}

	Shape(int side)
	{
		this.area = side*side;		
	}
	
	Shape(int length, int breadth){
		
		this.area = length*breadth;
	}
}





public class Assignment4 {

	public static void main(String[] args) {
		
		Shape square = new Shape(50);
		System.out.println(square.getArea());
		
		Shape rectangle = new Shape(10,60);
		System.out.println(rectangle.getArea());
	}
}